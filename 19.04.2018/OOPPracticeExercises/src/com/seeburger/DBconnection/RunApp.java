package com.seeburger.DBconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RunApp {

	public static void main(String[] args) {
		
		Connection conn = null;
        try{
        
        DatabaseConnection db = DatabaseConnection.getInstance();
        conn = db.connectToDatabase();
        CreateTables ct = new CreateTables();
//    ct.createTable(conn);
//        ct.deleteTable(conn);
//        ct.insert(conn);
        ct.delete(conn);
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }finally{
            try{
            if(conn != null)conn.close();
            }catch(SQLException sqle){
                sqle.printStackTrace();
            }
        }

	}

}
