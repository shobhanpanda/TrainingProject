package com.connection;

import java.sql.*;

public class MySQLConnection {
	
	public static Connection getConnection() {
	  
	Connection con = null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/training","root","");
 
	} catch (SQLException | ClassNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} 
	return con;
	
		}  
}
