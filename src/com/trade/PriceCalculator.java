package com.trade;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.datatype.DatatypeConfigurationException;

import org.apache.tomcat.jni.Local;
import org.eclipse.jdt.internal.compiler.env.AccessRuleSet;
import org.json.simple.JSONObject;

import com.connection.MySQLConnection;
import com.pojo.Bond;
import com.pojo.Trade;
import com.price_calculation.AccruedInterestCalculator;
import com.trade.DayCountConvention;


/**
 * Servlet implementation class PriceCalculator
 */
@WebServlet("/pricecalculator")
public class PriceCalculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PriceCalculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String isin = request.getParameter("isin");
		String y = request.getParameter("yield");
		Double d = Double.parseDouble(y);
		
		HttpSession session = request.getSession();
		String s = (String)session.getAttribute("yield");
		System.out.println(s);
		
		Connection conn= MySQLConnection.getConnection();
		String select="SELECT Bond.CouRate, Bond.IsDate, Bond.MatDate, "
				+ "Bond.Freq, CountryConvention.FV, CountryConvention.Tick_size, Bond.DayCouCon FROM Bond INNER JOIN CountryConvention ON Bond.CoCode=CountryConvention.CountryCode  WHERE Bond.ISIN='" +  isin + "';"; 
		PreparedStatement ps;
		
		try {
			ps = conn.prepareStatement(select);
			ResultSet rs=ps.executeQuery();
			rs.next();
			
			Bond bond = new Bond();
			bond.setCouponRate(rs.getFloat(1));
			bond.setIssueDate(rs.getDate(2).toLocalDate());
			bond.setMaturityDate(rs.getDate(3).toLocalDate());
			bond.setFaceValue(rs.getInt(5));
			bond.setFrequency(rs.getInt(4));
			bond.setTickSize(rs.getFloat(6));
			bond.setDayCountConvention(getDCC(rs.getInt(7)));
			
			Trade trade = new Trade();
			
			trade.setBond(bond);
			trade.setTradeDate(LocalDate.now());
			float ai = (float) AccruedInterestCalculator.calculate(trade);
			JSONObject j = new JSONObject();
			j.put("ai", ai);
			j.put("price",yieldToPrice(bond, d));
			couponDaysLeft(bond);
			PrintWriter pw = response.getWriter();
			pw.print(j.toJSONString());
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public double yieldToPrice(Bond bond, double i) {
		double c = bond.getCouponRate()/bond.getFrequency()/100;
		System.out.println(c + " " + i);
		i = i/bond.getFrequency()/100;
		int F = bond.getFaceValue();
		int N = couponDaysLeft(bond);
		double price;
		LocalDate settlementDate = LocalDate.now().plusDays(bond.gettPlus());
		System.out.println(bond.findLastCouponDate());
		double n = (double)ChronoUnit.DAYS.between(bond.findLastCouponDate(), settlementDate)*bond.getFrequency()/(getBasis(bond.getDayCountConvention()));
		System.out.println(n + " " + c + " " + i);
		price =(c*F*(1+((1-Math.pow(1+i, 1-N))/i)))/(Math.pow(1+i, n)) + (F/Math.pow(1+i, N+n-1));	
		System.out.println(price);
		return price;
	}
	
	public int couponDaysLeft(Bond bond) {
		
		LocalDate issueDate = bond.getIssueDate(), maturityDate = bond.getMaturityDate();
		LocalDate settlementDate = LocalDate.now();
		settlementDate.plusDays(bond.gettPlus());
		
		int frequency = bond.getFrequency();
		
		AllCouponDates cDates = new AllCouponDates();
		List<CouponDate> couponDates = cDates.calculate(issueDate, frequency);		
		
		int differenceInYears = maturityDate.getYear() - issueDate.getYear() - 1;
		int currentYear = settlementDate.getYear();
		
		List<LocalDate> paymentDates = getLocalDateFromCouponDate(couponDates, bond, currentYear, 0);
		paymentDates.addAll(getLocalDateFromCouponDate(couponDates, bond, bond.getMaturityDate().getYear(), 1));
		
		for (Iterator<LocalDate> iterator = paymentDates.iterator(); iterator.hasNext();) {
			LocalDate localDate = (LocalDate) iterator.next();
			System.out.println(localDate);
		}	
		
		int totalDays = differenceInYears*frequency + paymentDates.size();
		System.out.println("Payment days remaining:" + totalDays);
		
		if(differenceInYears == -1) {
			return 0;
		} else {
			return totalDays;
		}
	}
	
	public int getBasis(DayCountConvention dcc) {
		switch(dcc) {
		case ActualBy360: return 360;
		case ThirtyBy360: return 360;
		case ActualBy365: return 365;
		case ActualByActual: return (LocalDate.now().isLeapYear()?366:365);
		default: return 365;
		}
	}
	
	public ArrayList<LocalDate> getLocalDateFromCouponDate(List<CouponDate> cd, Bond bond, int year, int option) {
		Iterator it = (Iterator) cd.iterator();
		LocalDate localDate = LocalDate.now();
		LocalDate settlementDate = LocalDate.now();
		settlementDate.plusDays(bond.gettPlus());
		
		List<LocalDate> paymentDates = new ArrayList<LocalDate>();
		if(option == 0) {
			for (java.util.Iterator iterator = cd.iterator(); iterator.hasNext();) {
				CouponDate localDate2 = (CouponDate) iterator.next();				
				LocalDate tempDate = LocalDate.of(year, localDate2.month, localDate2.day);
				if(settlementDate.isBefore(tempDate)) {
					paymentDates.add(tempDate);
				}
			}
		} else if(option == 1) {
			for (java.util.Iterator iterator = cd.iterator(); iterator.hasNext();) {
				CouponDate localDate2 = (CouponDate) iterator.next();				
				LocalDate tempDate = LocalDate.of(year, localDate2.month, localDate2.day);
				if(bond.getMaturityDate().isAfter(tempDate)) {
					paymentDates.add(tempDate);
				}
			}
		}
		
		return (ArrayList<LocalDate>) paymentDates;
	}
	
	public DayCountConvention getDCC(int value) {
		switch(value) {
			case 1: return DayCountConvention.ActualByActual;
			case 2: return DayCountConvention.ActualBy360;
			case 3: return DayCountConvention.ActualBy365;
			case 4: return DayCountConvention.ThirtyBy360;
			default:return DayCountConvention.ActualByActual;		
		}
	}

}

//int row_count=0;
//System.out.println("while here");
//b.setCouponRate(rs.getFloat(1));
//issueDate = rs.getDate(2);
//matDate = rs.getDate(3);
//b.setFrequency(rs.getInt(4));
//	//b.setTickSize(rs.getFloat(6));
//	row_count++;
//System.out.println("row_count : "+ row_count);
//b.setIssueDate(issueDate.toLocalDate());
//b.setMaturityDate(matDate.toLocalDate());
//
//System.out.println(b.toString());
//LocalDate lastCouponDate = LastCouponPaymentCalculator.findLastCouponDate(b.getIssueDate(), frequency, 0);
