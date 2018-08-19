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
	public void doPost(HttpServletRequest request,HttpServletResponse response) {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		Connection conn=  MySQLConnection.getConnection();
		String insert="INSERT INTO login_credentials (name,password) VALUES(?,?)";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(insert);
			ps.setString(1, name);
			ps.setString(2, password);
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
