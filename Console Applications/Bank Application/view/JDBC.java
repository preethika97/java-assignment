package view;

import java.sql.*;

public class JDBC {
	// private static
	public static Connection jdbcConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/userdetails", "root", "Password");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
