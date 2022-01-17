package com.xworkz.newspaper;

import java.sql.*;

public class Tester {
	
	
	static String url="jdbc:mysql://localhost:3306/jdbc";
	static String username="root";
	static String password="Krishnapl@123";
	//static String sqlStatemnt="insert into jdbc.newspaper values(5,'Tamli','Times of India',50)";
	//static String updateQuery="update jdbc.newspaper set price=60 where id=4";
	static String deleteQuery="delete from jdbc.newspaper where id=5;";
	
	public static void main(String args[]) throws Exception {
		
		//Driver driver=Class.forName("com.mysql.cj.jdbc.Driver");
		
		//DriverManager.registerDriver(driver);
		
		Connection connection=DriverManager.getConnection(url,username,password);
		
		System.out.println(connection+url);
		
		Statement statement=connection.createStatement();
		//statement.executeUpdate(sqlStatemnt);
		//statement.executeUpdate(updateQuery);
		statement.executeUpdate(deleteQuery);
		
		System.out.println("query is executed");
		
	}

}
