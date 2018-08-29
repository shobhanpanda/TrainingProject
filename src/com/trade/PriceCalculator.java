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
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeConfigurationException;

import org.apache.tomcat.jni.Local;
import org.json.simple.JSONObject;

import com.connection.MySQLConnection;
import com.pojo.Bond;
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
			bond.setDayCountConvention(getDayCountConvention(rs.getInt(7)));
					
			couponDaysLeft(bond.getIssueDate(), bond.getMaturityDate(),bond.getFrequency());
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int couponDaysLeft(LocalDate issueDate, LocalDate maturityDate, int frequency) { 
		AllCouponDates cDates = new AllCouponDates();
		List<CouponDate> couponDates = cDates.calculate(issueDate, frequency);
		return 0;
	}
	
	public DayCountConvention getDayCountConvention(int value) {
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
