package com.trade;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
		String insert="INSERT INTO trade (ISIN,TradeType,TradeDate,TradePrice,TradeYield,CounterParty,UserName) VALUES(?,?,?,?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(insert);
			
			// Set String
			ps.setString(1, request.getParameter("isin"));
			ps.setString(2, request.getParameter("tradetype"));
			ps.setString(3, request.getParameter("tradedate"));
			System.out.println(request.getParameter("price"));
			ps.setInt(4, Integer.parseInt(request.getParameter("price")));			
			ps.setFloat(5, Float.parseFloat(request.getParameter("yield")));
			ps.setString(6, request.getParameter("counterparty"));
			ps.setString(7,(String)session.getAttribute("userName"));
			System.out.println(ps);
			int flag=ps.executeUpdate();
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
