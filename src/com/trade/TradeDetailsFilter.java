package com.trade;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

import com.connection.MySQLConnection;
import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet Filter implementation class TradeDetailsFilter
 */
@WebFilter("/trade")
public class TradeDetailsFilter implements Filter {

	private Connection conn;
	public void destroy() {
		// TODO Auto-generated method stub
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		String str=request.getParameter("isin");
		// Change table here
		String select="SELECT * FROM refdb where ISIN=?";
		PreparedStatement ps;
		
		try {
			ps=conn.prepareStatement(select);
			ps.setString(1, str);
//			System.out.println(ps);
			ResultSet rs=ps.executeQuery();
			int row=0;
			while(rs.next()) {
				row+=1;
			}
//			System.out.println(row);
			if(row>0) {
				chain.doFilter(request, response);
			}
			else {
				HttpServletResponse httpResponse = (HttpServletResponse) response;
				httpResponse.sendRedirect("trade.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// pass the request along the filter chain
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		conn=MySQLConnection.getConnection();
	}

}
