package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import java.sql.ResultSet;


import java.sql.PreparedStatement;
public class DbConnection {
	
	public static Connection getConn() throws ClassNotFoundException {
		
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/usersign";
	    String uName = "root";
	    String pW = "";
	    
		try{
		    con = DriverManager.getConnection(url,uName,pW);
		    System.out.println("Connection is created successfully:");
		    
		    //Statement st = (Statement) con.createStatement();
		    
		    //String query ="INSERT INTO `student` ( `fName`, `lName`, `email`, `pNum`) VALUES ("+studentData+")";
		    
		    //((java.sql.Statement) st).executeUpdate(query);
		    //System.out.println("Record is inserted in the table successfully..................");
		   
			}
		catch (Exception e){
		    System.out.println(e.toString());
			}
		return con;
	}

	
}
