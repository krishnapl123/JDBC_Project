package com.xworkz.newspaper;

import java.sql.*;

public class Tester {
	
	
	static String url="jdbc:mysql://localhost:3306/jdbc";
	static String username="root";
	static String password="Krishnapl@123";
	//static String sqlStatemnt="insert into jdbc.newspaper values(5,'Tamli','Times of India',50)";
	//static String updateQuery="update jdbc.newspaper set price=60 where id=4";
	static String deleteQuery="delete from jdbc.newspaper where id=5;";
	static String selectNewspaperQuery="select * from jdbc.newspaper where Id=3;";
	
	public static void main(String args[]) throws Exception {
		//step1: Loading is nothing but creating object 
		//Driver driver=Class.forName("com.mysql.cj.jdbc.Driver"); we are creating the obj of Driver class
	//	Class.forName is another way to create an object.
		
		//step2:registering with DriverManager(connection provider)
		//DriverManager.registerDriver(driver);
		
		//Step3: getting connection
		Connection connection=DriverManager.getConnection(url,username,password);
		
		System.out.println(connection+url);
		
		//step4:sendig our query from java to mysql through vehicle connection.createStatement
		Statement statement=connection.createStatement();
		//statement.executeUpdate(sqlStatemnt);
		//statement.executeUpdate(updateQuery);
		//statement.executeUpdate(deleteQuery);
		
		statement.executeQuery(selectNewspaperQuery);
		
		System.out.println("query is executed");
		
	}

}
