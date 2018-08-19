package com.trade;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connection.MySQLConnection;
@WebServlet("/trade")
public class TradeDetails extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) {

		Connection conn=  MySQLConnection.getConnection();
		String insert="INSERT INTO trade_details (isin,trade_date,trade_time,buy_sell,traded_price,counterparty,settlement_date) VALUES(?,?,?,?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(insert);
			// Set String
			ps.setString(1, request.getParameter("isin"));
			ps.setString(2, request.getParameter("tradedate"));
			ps.setString(3, request.getParameter("time"));
			ps.setString(4, request.getParameter("buy"));
			ps.setString(5, request.getParameter("price"));
			ps.setString(6, request.getParameter("counterparty"));
			ps.setString(7, request.getParameter("settlementdate"));
			int flag=ps.executeUpdate();
			conn.close();
			if(flag>0) {
			response.sendRedirect("index.jsp" );
			}else {
				response.sendRedirect("register.jsp");
			}
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
