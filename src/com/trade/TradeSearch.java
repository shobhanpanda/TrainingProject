package com.trade;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connection.MySQLConnection;

import java.sql.*;
@WebServlet("/securitysearch")
public class TradeSearch extends HttpServlet {
	
	public void service(HttpServletRequest request,HttpServletResponse response) {
		String search=request.getParameter("substr");
		Connection conn= MySQLConnection.getConnection();
		String select="SELECT * FROM reference_table where ProductName like '?%'";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(select);
			ps.setString(1, search);
			ResultSet rs=ps.executeQuery();
			while(rs.next())  {
				//Enter the table entries here
			}
			conn.close(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
