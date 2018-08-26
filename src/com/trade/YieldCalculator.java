package com.trade;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connection.MySQLConnection;
import org.json.simple.JSONObject;
/**
 * Servlet implementation class YieldCalculator
 */
@WebServlet("/yieldcalculator")
public class YieldCalculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String isin=request.getParameter("isin");
		//System.out.println(isin);
		Connection conn= MySQLConnection.getConnection();
		String select="SELECT refdb.CouRate,(DATEDIFF(refdb.MatDate,refdb.IsDate)/365),fvconv.FV FROM refdb "+
				"INNER JOIN fvconv ON refdb.CoCode=fvconv.Country WHERE refdb.ISIN='"+ isin+"'" ;
		System.out.println(select);
		PreparedStatement ps;
		JSONObject json=new JSONObject();
		try {
			ps = conn.prepareStatement(select);
			ResultSet rs=ps.executeQuery();
			while(rs.next())  {
				//Enter the table entries here
				json.put("coupon", rs.getFloat(1));
				json.put("year", rs.getFloat(2));
				json.put("facevalue", rs.getInt(3));
			}
			conn.close();
			PrintWriter out=response.getWriter();
			out.print(json.toJSONString());
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}