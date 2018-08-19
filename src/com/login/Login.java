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
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		Connection conn= MySQLConnection.getConnection();
		String select="SELECT * FROM login_credentials WHERE name=? AND password=? ";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(select);
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			while(rs.next())  {
				if(rs.getString("name").equals(name)&& rs.getString("password").equals(password)) {
					response.sendRedirect("trade.jsp");
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
