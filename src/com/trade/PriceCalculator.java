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

import org.json.simple.JSONObject;

import com.connection.MySQLConnection;

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
		String select="SELECT SecDet.CouRate, SecDet.IsDate, SecDet.MatDate, "
				+ " SecDet.Freq,fvconv.FV,fvconv.Tick_size FROM SecDet INNER JOIN fvconv ON SecDet.CoCode=fvconv.Country  WHERE SecDet.ISIN='"+ isin+"'" ;
		
		PreparedStatement ps;
		JSONObject json=new JSONObject();
		try {
			ps = conn.prepareStatement(select);
			ResultSet rs=ps.executeQuery();
			while(rs.next())  {
				//Enter the table entries here
				json.put("coupon", rs.getFloat(1));
				json.put("year", rs.getFloat(2));
				json.put("days_left", rs.getInt(3));
				json.put("facevalue", rs.getInt(5));
				json.put("freq",rs.getInt(4));
				json.put("isin", isin);
				json.put("tick", rs.getFloat(6));
			}
			conn.close();
			PrintWriter out=response.getWriter();
			System.out.println();
			out.print(json.toJSONString());
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
