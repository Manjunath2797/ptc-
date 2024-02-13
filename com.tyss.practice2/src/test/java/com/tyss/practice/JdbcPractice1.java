package com.tyss.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JdbcPractice1 {

	public static void main(String[] args) throws Exception {
		Connection con = null;
		try {
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
			
			Statement state = con.createStatement();
			
			String query = "select * from project1;";
			
			ResultSet result = state.executeQuery(query);
			
			while (result.next()) {

				System.out.println(result.getString("Proj_ID"));
			}
		}
		catch (Exception e) {
		}
		finally {
			con.close();
		}
	}

}
