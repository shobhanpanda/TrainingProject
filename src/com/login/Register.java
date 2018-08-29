package com.login;

import java.io.IOException;
import java.sql.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.connection.MySQLConnection;

@WebServlet("/register")
public class Register extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String userName=request.getParameter("userName");
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String password=request.getParameter("password");
		Connection conn=  MySQLConnection.getConnection();
		String insert="INSERT INTO UserTable(UserName,FirstName,LastName,Password,Approval) VALUES(?,?,?,?,0)";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(insert);
			ps.setString(1, userName);
			ps.setString(2, firstName);
			ps.setString(3, lastName);
			ps.setString(4, password);
			System.out.println(userName+firstName+lastName+password);
			int flag=ps.executeUpdate();
			conn.close();
			if(flag>0) {
			response.sendRedirect("index.jsp" );
			}
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.sendRedirect("register.jsp");
		}
	}
}
