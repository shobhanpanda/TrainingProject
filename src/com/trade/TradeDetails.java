package com.trade;

import java.sql.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.connection.MySQLConnection;
@WebServlet("/trade")
public class TradeDetails extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) {
		HttpSession session=request.getSession();
		Connection conn=  MySQLConnection.getConnection();
		String insert="INSERT INTO trade (ISIN,TradeType,TradeDate,CleanPrice,TradeYield,CounterParty,UserName,AccruedInterest,TradeID) VALUES(?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(insert);
			
			// Set String
			Statement st = conn.createStatement();
			String getID = "select MAX(TradeID) from Trade";
			ResultSet id = st.executeQuery(getID);
			id.next();
			ps.setInt(9, (id.getInt(1)+1));
			ps.setString(1, request.getParameter("isin"));
			ps.setString(2, request.getParameter("tradetype"));
			ps.setString(3, request.getParameter("tradedate"));
			System.out.println(request.getParameter("accrued"));
			ps.setFloat(4, Float.parseFloat(request.getParameter("price")));			
			ps.setFloat(5, Float.parseFloat(request.getParameter("yield")));
			ps.setString(6, request.getParameter("counterparty"));
			ps.setString(7,(String)session.getAttribute("userName"));
			ps.setFloat(8, Float.parseFloat(request.getParameter("accrued")));
			
			int flag=ps.executeUpdate();
			System.out.println(flag);
			conn.close();
			if(flag>0) {
			response.sendRedirect("trade.jsp" );
			}else {
				//Send to error page
				
			}
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
