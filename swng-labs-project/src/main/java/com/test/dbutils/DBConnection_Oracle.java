package com.test.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection_Oracle {
	
	
	public static void main(String[] args) throws ClassNotFoundException {
		DBConnection_Oracle db=new DBConnection_Oracle();
		db.Oracle_Db();
	}

	public void Oracle_Db() throws ClassNotFoundException {
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl"; // table details
		String username = "SYS as sysdba"; // SQL credentials
		String password = "bye5";

		String query = "select * from sample"; // query to be run
	
		Class.forName("oracle.jdbc.driver.OracleDriver"); // Driver name

		try {
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

			Connection con = DriverManager.getConnection(url, username, password);

			System.out.println("Connection Established successfully");
			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery(query); // Execute query
			
			
			
			while(rs.next()) {
			System.out.println(rs.getString("FirstName")+ "  "+rs.getLong(5));
			
		
//			String name = rs.getString("FirstName"); // Retrieve name from db
//			System.out.print(name); // Print result on console
			
			}
			
			st.close(); // close statement
			con.close(); // close connection
			
			System.out.println("Connection Closed....");
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

		}
	}
}
