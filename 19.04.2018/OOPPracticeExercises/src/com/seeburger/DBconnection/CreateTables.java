package com.seeburger.DBconnection;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class CreateTables {

	public void createTable(Connection conn) throws SQLException
	{
		
		 Statement stmt = conn.createStatement();
         String sql = "CREATE TABLE IF NOT EXISTS FACULTY "
                 + "(ID INT PRIMARY KEY    ,"
                 + " NAME           TEXT    NOT NULL, "
                 + " FAMILY            TEXT     NOT NULL, "
                 + " F_NUM        INT) ";
                 //+ " SALARY         REAL)";
         stmt.execute(sql);
         stmt.close();
        
     System.out.println("Table created successfully");
	}
	
	public void deleteTable(Connection conn)throws SQLException
	{    
		 Statement st = conn.createStatement();
		 String sql = "drop database sqlite:test.db";
		 st.execute(sql);
		 st.close();
//		  conn.close();
		  System.out.println("Table was droped!");
		
		
	}
	
	public void insert(Connection conn) throws SQLException
	{
		Statement stmt = conn.createStatement();
        String sql = "insert into FACULTY (id, name, family, f_num)"
        		+ "values (1245, 'maria', 'nikolova', 124562)";
        stmt.execute(sql);
		 stmt.close();
		 
		 System.out.println("Inserted");
		 
	}
	
	public void delete(Connection conn) throws SQLException
	{
		Statement stmt = conn.createStatement();
        String sql = "delete from FACULTY";
        stmt.execute(sql);
		 stmt.close();
		 
		 System.out.println("Deleted");
		 
	}

}
