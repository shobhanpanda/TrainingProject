package com.connection;

import java.sql.*;

public class MySQLConnection {
	
	public static Connection getConnection() {
	  
	Connection con = null;
	try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;dataBaseName=ReferDb", "sa","sa123");
 
	} catch (SQLException | ClassNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} 
	return con;
	
		}  
}
