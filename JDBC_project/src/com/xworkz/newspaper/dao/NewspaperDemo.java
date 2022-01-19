package com.xworkz.newspaper.dao;

import java.sql.*;

public class NewspaperDemo {
	
	public static void main(String args[]) {
		
		NewspaperDAOImpl newspaperDAOImpl=new NewspaperDAOImpl();
		
		//newspaperDAOImpl.saveNewspaperEntity();
		//newspaperDAOImpl.deleteNewspaperEntity();
		//newspaperDAOImpl.updateNewspaperEntity();
		newspaperDAOImpl.readNewspaperEntity();
		//newspaperDAOImpl.readAllNewspaperEntity();
	}

}
