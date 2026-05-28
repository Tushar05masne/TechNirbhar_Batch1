package com.test.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection_Mysql {

	public void My_Sql_Db() {
		
			try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/autobdtest","root","KTM@ktm@2022");  
			//here autobdtest is database name, root is username and KTM...password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from sample");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
			}catch(Exception e)
				{ 
				System.out.println(e);
				}  
		}  
}  

	


