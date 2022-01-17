package com.xworkz.newspaper;

import java.sql.*;
public class Airport {
	
	static String url="jdbc:mysql://localhost:3306/jdbc";
	static String username="root";
	static String password="Krishnapl@123";
	static String sqlStatement="insert into jdbc.airport values(2,'Indira Gandhi Int Ap','Delhi','America',5,'Palam',false);";
	static String updateQuery="update jdbc.airport set noOfTerminals=6 where A_id=2";
	static String deleteQuery="delete from jdbc.airport where A_id=3;";
	static String selectQuery="select *from jdbc.airport where A_id=2";
	public static void main(String args[]) {
		
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(url,username,password);
			System.out.println(connection+url);
			Statement statement=connection.createStatement();
		    statement.executeUpdate(updateQuery);
			System.out.println("query is executed");
		} catch (SQLException e) {
			System.out.println("query is not executed"+e.getMessage());
		}
		finally {
		try {
			if(connection!=null) {
				connection.close();	
			}else {
				System.out.println("connection is not created");
			}
			
		} catch (SQLException e) {
			
		}
		
	}

 }
	
}