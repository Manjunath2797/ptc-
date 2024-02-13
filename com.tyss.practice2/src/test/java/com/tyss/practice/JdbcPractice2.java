package com.tyss.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JdbcPractice2 {

	public static void main(String[] args) throws Exception {
		Connection con = null;
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");

			Statement state = con.createStatement();
			String query = "insert into project1 values(7,'Gpay',5),(8,'maps',5);";

			int a = state.executeUpdate(query);
			System.out.println(a);
			
			if (a>=1) {
				System.out.println("insertion successfull");
			}
			else {
				System.out.println("insertion failed");
			}
		}
		catch (Exception e) {
		}
		finally {
			con.close();
		}
	}

}
