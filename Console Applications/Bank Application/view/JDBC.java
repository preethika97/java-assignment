package view;

import java.sql.*;

public class Jdbc {
	 private static Connection jdbc;
	public static Connection jdbcConnection() {
		if(jdbc==null)
		try {
			jdbc= DriverManager.getConnection("jdbc:mysql://localhost:3306/userdetails", "root", "Password");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return jdbc;
	}
}
