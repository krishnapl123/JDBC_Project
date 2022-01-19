package com.xworkz.newspaper.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NewspaperDAOImpl implements NewsPaperDAO{
	
	static String url="jdbc:mysql://localhost:3306/jdbc";
	static String userName="root";
	static String password="Krishnapl@123";
	static String sqlInsertStatement="insert into jdbc.newspaper values(5,'Sanskrit','LavaLavike',60)";
	static String deleteQuery="delete from jdbc.newspaper where id=1;";
	static String updateQuery="update jdbc.newspaper set price=100 where id=4";
	//static String selectNewspaperQuery="select * from newspaper where Id=5;";
	//static String selectNewspaperQuery="select * from newspaper where Id<5;";
	//static String selectNewspaperQuery="select * from newspaper where Id>3;";
	//static String selectNewspaperQuery="select * from newspaper where Id in(2,3);";
	//static String selectNewspaperQuery="select * from newspaper where Id between 2 and 4;";
	//static String selectNewspaperQuery="select * from newspaper where Id not in (4);";
	//static String selectNewspaperQuery="select * from newspaper where Id=2 or Id=6 or Id=4 or Id=100 or Id=20000 or Id=123;";
	//static String selectNewspaperQuery="select * from newspaper order by Id;";
	//static String selectNewspaperQuery="select * from newspaper order by Id desc";
	//static String selectNewspaperQuery="select * from newspaper order by News_Paper_name";
	//static String selectNewspaperQuery="select * from newspaper order by News_Paper_name desc";
	//static String selectNewspaperQuery="select * from newspaper order by  price";
	//static String selectNewspaperQuery="select * from newspaper order by  price desc";
	//static String selectNewspaperQuery="select * from newspaper where price<50";
	//static String selectNewspaperQuery="select * from newspaper where price>50";
	static String selectNewspaperQuery="select * from newspaper where price between 10 and 50";
	
	//static String selectNewspaperQuery="select * from newspaper limit 2";
	//static String selectNewspaperQuery="select * from newspaper order by Id desc limit 2";
	//static String selectNewspaperQuery="select * from newspaper where News_Paper_lang like'M%'";
	//static String selectNewspaperQuery="select * from newspaper where News_Paper_name like'T%';" ;
	//static String selectNewspaperQuery="select * from newspaper where News_Paper_name like'%India'";

	static String selectAllNewsopaperQuery="select *from jdbc.newspaper;";
	
	@Override
	public void saveNewspaperEntity() {
		Connection connection=null;
		
		try {
		 connection=DriverManager.getConnection(url,userName,password);
		System.out.println(connection+url);
		Statement statement=connection.createStatement();		
		statement.executeUpdate(sqlInsertStatement);
		System.out.println("query is executed");
		}catch(SQLException e) {
			
			System.out.println("query is not executed"+e.getMessage());
		}
		finally {
			
		try {
			if(connection!=null){
			connection.close();
			System.out.println("connection is closed");
		} else {
			
			System.out.println("connection is not created");
		}
		}catch (SQLException e) {
			
		}
		
	}

		
	}

	@Override
	public void deleteNewspaperEntity() {
		Connection connection=null;
		
		try {
		 connection=DriverManager.getConnection(url,userName,password);
		System.out.println(connection+url);
		Statement statement=connection.createStatement();
	    statement.executeUpdate(deleteQuery);		
		System.out.println("query is executed");	
		}catch(SQLException e) {
			
			System.out.println("query is not executed"+e.getMessage());
		}
		finally {
			
		try {
			if(connection!=null){
			connection.close();
			System.out.println("connection is closed");
		} else {
			
			System.out.println("connection is not created");
		}
		}catch (SQLException e) {
			
		}
		
	}

		
	}

	@Override
	public void updateNewspaperEntity() {
		Connection connection=null;
		
		try {
		 connection=DriverManager.getConnection(url,userName,password);
		System.out.println(connection+url);
		Statement statement=connection.createStatement();
		statement.executeUpdate(updateQuery);
		System.out.println("query is executed");	
		}catch(SQLException e) {
			
			System.out.println("query is not executed"+e.getMessage());
		}
		finally {
			
		try {
			if(connection!=null){
			connection.close();
			System.out.println("connection is closed");
		} else {
			
			System.out.println("connection is not created");
		}
		}catch (SQLException e) {
			
		}
		
	}

		
	}

	@Override
	public void readNewspaperEntity() {

		Connection connection=null;
		
		try {
		 connection=DriverManager.getConnection(url,userName,password);
		System.out.println(connection+url);
		Statement statement=connection.createStatement();
		//statement.executeUpdate(updateQuery);
		
		ResultSet resultSet=statement.executeQuery(selectNewspaperQuery);
		while(resultSet.next())
		{
		System.out.println(resultSet.getInt(1));
		System.out.println(resultSet.getString(2));
		System.out.println(resultSet.getString(3));
		System.out.println(resultSet.getInt(4));
		}
		System.out.println("query is executed");
		}catch(SQLException e) {
			
			System.out.println("query is not executed"+e.getMessage());
		}
		finally {
			
		try {
			if(connection!=null){
			connection.close();
			System.out.println("connection is closed");
		} else {
			
			System.out.println("connection is not created");
		}
		}catch (SQLException e) {
			
		}
		
	}

		
		
		
	}

	@Override
	public void readAllNewspaperEntity() {
		Connection connection=null;
		
		try {
		 connection=DriverManager.getConnection(url,userName,password);
		System.out.println(connection+url);
		Statement statement=connection.createStatement();		
		ResultSet resultSet=statement.executeQuery(selectAllNewsopaperQuery);	
		while(resultSet.next()) {
		System.out.println(resultSet.getInt(1));
		System.out.println(resultSet.getString(2));
		System.out.println(resultSet.getString(3));
		System.out.println(resultSet.getInt(4));
		}
     	System.out.println("query is executed");
		}catch(SQLException e) {
			
			System.out.println("query is not executed"+e.getMessage());
		}
		finally {
			
		try {
			if(connection!=null){
			connection.close();
			System.out.println("connection is closed");
		} else {
			
			System.out.println("connection is not created");
		}
		}catch (SQLException e) {
			
		}
		
	}

		
	}
	

}
