package com.trade;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.BasicConfigurator;

import local_project.test_dynamic_0_1.test_dynamic;
@WebServlet("/generatetrades")

public class RandomTradeGenerator extends HttpServlet {
	
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) {
		int trades=Integer.parseInt(request.getParameter("randomTrades"));
		BasicConfigurator.configure();
		test_dynamic generator = new test_dynamic();
		String[] context = new String[] {"--context_param row_no="+trades};
		generator.runJob(context);
	}

}
