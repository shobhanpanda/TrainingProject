package com.trade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.BasicConfigurator;

import com.connection.*;


import local_project.test_dynamic_0_1.test_dynamic;
@WebServlet("/generatetrades")

public class RandomTradeGenerator extends HttpServlet {
	
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) {
		int trades=Integer.parseInt(request.getParameter("randomTrades"));
		BasicConfigurator.configure();
		test_dynamic generator = new test_dynamic();
		String[] context = new String[] {"--context_param row_no="+trades};
		generator.runJob(context);
		
		String select = "select * from Trade";
		Connection conn=MySQLConnection.getConnection();
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(select);
			ResultSet rs;
			rs = ps.executeQuery();
			while(rs.next()) {
				String str="UDPATE Trade set AccruedInterest=?, CleanPrice=? WHERE ISIN=?";
				PreparedStatement pst=conn.prepareStatement(str);
				pst.setString(3,rs.getString("ISIN"));
				
				
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}

}
