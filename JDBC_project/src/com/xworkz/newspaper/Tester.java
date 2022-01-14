package com.xworkz.newspaper;

import java.sql.*;

public class Tester {
	
	
	static String url="jdbc:mysql://localhost:3306/jdbc";
	static String username="root";
	static String password="Krishnapl@123";
	static String sqlStatemnt="insert into jdbc.newspaper values(4,'hindi','The Hindu',50)";
	
	public static void main(String args[]) throws Exception {
		
		//Driver driver=Class.forName("com.mysql.cj.jdbc.Driver");
		
		//DriverManager.registerDriver(driver);
		
		Connection connection=DriverManager.getConnection(url,username,password);
		
		System.out.println(connection+url);
		
		Statement statement=connection.createStatement();
		statement.executeUpdate(sqlStatemnt);
		
		System.out.println("query is executed");
		
	}

}
