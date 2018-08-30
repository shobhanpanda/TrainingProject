package com.trade;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.BasicConfigurator;

import com.connection.*;
import com.pojo.Bond;
import com.pojo.Trade;
import com.price_calculation.AccruedInterestCalculator;

import local_project.test_dynamic_0_1.test_dynamic;
@WebServlet("/generatetrades")

public class RandomTradeGenerator extends HttpServlet {
	
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		int trades=Integer.parseInt(request.getParameter("randomTrades"));
		BasicConfigurator.configure();
		test_dynamic generator = new test_dynamic();
		String[] context = new String[] {"--context_param row_no="+trades};
		generator.runJob(context);
		
		String select = "select * from Trade";
		Connection conn=MySQLConnection.getConnection();
		PreparedStatement psSelect;
		try {
			psSelect = conn.prepareStatement(select);
			ResultSet rsSelect;
			rsSelect = psSelect.executeQuery();
			while(rsSelect.next()) {
				String updateString="UPDATE Trade set AccruedInterest=?, CleanPrice=?, TradePrice=? WHERE ISIN=?";
				PreparedStatement psUpdate = conn.prepareStatement(updateString);
				psUpdate.setString(4,rsSelect.getString("ISIN"));
				
				String selectQuery="SELECT Bond.CouRate, "
						+ "Bond.Freq, CountryConvention.FV, CountryConvention.Tick_size, Bond.IsDate, Trade.TradeYield "
						+ ", Bond.DayCouCon, Bond.IsDate, Bond.MatDate FROM Bond INNER JOIN Trade ON Bond.ISIN = Trade.ISIN INNER JOIN CountryConvention ON CountryConvention.CountryCode = Bond.CoCode WHERE Bond.ISIN='" +  rsSelect.getString("ISIN") + "';"; 
				PreparedStatement prep;
				
				try {
					prep = conn.prepareStatement(selectQuery);
					ResultSet rsBond = prep.executeQuery();
					rsBond.next();
					
					Bond bond = new Bond();
					bond.setCouponRate(rsBond.getFloat(1));
					bond.setFaceValue(rsBond.getInt(3));
					bond.setFrequency(rsBond.getInt(2)>0?rsBond.getInt(2):1);
					bond.setTickSize(rsBond.getFloat(4));
					bond.setIssueDate(rsBond.getDate(5).toLocalDate());
					bond.setIssueDate(rsBond.getDate(8).toLocalDate());
					bond.setMaturityDate(rsBond.getDate(9).toLocalDate());
					bond.setDayCountConvention(getDCC(rsBond.getInt(7)));
					Trade trade = new Trade();
					
					trade.setBond(bond);
					trade.setTradeDate(LocalDate.now());
					trade.setYield(rsBond.getFloat(6));
					
					trade.setSettlementDate(trade.getTradeDate());
					float ai = (float) AccruedInterestCalculator.calculate(trade);
					
					double c = bond.getCouponRate()/bond.getFrequency()/100;
					float yield = (float)trade.getYield();
					yield = yield/bond.getFrequency()/100;
					int F = bond.getFaceValue();
					int N = couponDaysLeft(bond);
					float price;
					LocalDate settlementDate = LocalDate.now().plusDays(bond.gettPlus());
					System.out.println(bond.findLastCouponDate());
					double n = (double)ChronoUnit.DAYS.between(bond.findLastCouponDate(), settlementDate)*bond.getFrequency()/(365);
					System.out.println(n + " " + c + " " + yield);
					
					price =(float)((c*F*(1+((1-Math.pow(1+yield, 1-N))/yield)))/(Math.pow(1+yield, n)) + (F/Math.pow(1+yield, N+n-1)));	
					psUpdate.setFloat(1, ai);
					psUpdate.setFloat(2, (price-ai));
					psUpdate.setFloat(3, price);
					psUpdate.executeUpdate();
					
			} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			}
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		response.sendRedirect("trade.jsp");
	}
		
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
	
	public int couponDaysLeft(Bond bond) {
		
		LocalDate issueDate = bond.getIssueDate(), maturityDate = bond.getMaturityDate();
		LocalDate settlementDate = LocalDate.now();
		//settlementDate.plusDays(bond.gettPlus());
		
		int frequency = bond.getFrequency();
		
		AllCouponDates cDates = new AllCouponDates();
		List<CouponDate> couponDates = cDates.calculate(issueDate, frequency);
		System.out.println(couponDates);
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
}


