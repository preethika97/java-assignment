package controller;

import java.sql.*;

public class Bank {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		System.out.println("Welcome to Indian Bank");
		System.out.println("*******************");
		System.out.println();
		Operations operations = new Operations();
		operations.mainMenu();
	}
}
