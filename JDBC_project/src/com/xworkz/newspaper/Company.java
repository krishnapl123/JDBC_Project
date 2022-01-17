package com.xworkz.newspaper;

import java.sql.*;

public class Company {
	
	static String url="jdbc:mysql://localhost:3306/jdbc";
	static String userName="root";
	static String password="Krishnapl@123";
	static String sqlStatement="insert into jdbc.company values(5,'BEL','Mumbai',false,5000000.7464,'B',55000)";
	static String updateQuery="update jdbc.company set Company_Name='BMW' where C_Id=1";
	static String deleteQuery="delete from jdbc.company where C_Id=5";
	
	public static void main(String args[]){
		
		Connection connection=null;
		
		try {
		 connection=DriverManager.getConnection(url,userName,password);
		System.out.println(connection+url);
		Statement statement=connection.createStatement();
		statement.executeUpdate(updateQuery);
		System.out.println("query is executrd");
		}catch(SQLException e) {
			
			System.out.println("query is not executed"+e.getMessage());
		}
		finally {
			
		try {
			if(connection!=null){
			connection.close();
		} else {
			
			System.out.println("connection is not created");
		}
		}catch (SQLException e) {
			
		}
		
	}

  }
}