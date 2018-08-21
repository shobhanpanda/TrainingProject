package com.trade;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connection.MySQLConnection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
@WebServlet("/securitysearch")
public class TradeSearch extends HttpServlet {
	
	public void service(HttpServletRequest request,HttpServletResponse response) {
		String search=request.getParameter("substr");
		Connection conn= MySQLConnection.getConnection();
		String select="SELECT * FROM refdb where ISIN like '"+ search+"%'";
		System.out.println(select);
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(select);
			ResultSet rs=ps.executeQuery();
			String str="<ul>";
			while(rs.next())  {
				//Enter the table entries here
				str+="<li>"+rs.getString("ISIN")+"</li>";
			}
			str+="</ul>";
			conn.close();
			PrintWriter out=response.getWriter();
			out.print(str);
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
