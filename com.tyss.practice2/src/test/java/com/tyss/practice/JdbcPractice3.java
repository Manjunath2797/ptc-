package com.tyss.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JdbcPractice3 {

	public static void main(String[] args) throws Exception {
		Connection con = null;
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
			
			Statement state = con.createStatement();
			
			String query = "delete from project1 where Proj_ID=8;";
			
			int result = state.executeUpdate(query);
			System.out.println(result);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			con.close();
		}
		
		
		
	}

}
