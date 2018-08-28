package com.login;
import com.connection.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		Connection conn= MySQLConnection.getConnection();
		String select="SELECT * FROM User1 WHERE userName=? AND Password=? AND Approval=1 ";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(select);
			ps.setString(1, userName);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			while(rs.next())  {
				System.out.println(rs.getString("userName"));
				if(rs.getString("userName").equals(userName)&& rs.getString("Password").equals(password)) {
					response.sendRedirect("dashboard.jsp");
					return;
				}

			}
			conn.close(); 
			response.sendRedirect("index.jsp" );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
