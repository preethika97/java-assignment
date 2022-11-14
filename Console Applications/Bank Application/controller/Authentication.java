
package controller;

import model.User;
import view.Choice;
import view.JDBC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;

public class Authentication {
	public void login() throws ClassNotFoundException, SQLException {
		Scanner userInput = new Scanner(System.in);
		User user = new User();
		System.out.println("Enter the User Name:");
		user.setUser_Name(userInput.next());
		System.out.println("Enter password");
		user.setPassword(userInput.nextInt());
		// userInput.nextLine();
		try {
			PreparedStatement ps = JDBC.jdbcConnection()
					.prepareStatement("select * from userInfo where User_Name=? AND Password=?");
			ps.setString(1, user.getUser_Name());
			ps.setInt(2, user.getPassword());
			ResultSet rs = ps.executeQuery();
			if (rs.next())
				System.out.println("Welcome " + user.getUser_Name() + "!!");
			else {
				System.out.println("Invalid user name and password");
				System.out.println("Re-enter userName and Passowrd!");
				login();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Choice choice = new Choice();
		choice.secondPage();
	}

	public void signUp() throws ClassNotFoundException, SQLException {
		Scanner userInput = new Scanner(System.in);
		User user = new User();
		System.out.println("Enter the user_name:");
		user.setUser_Name(userInput.next());
		System.out.println("Create password:");
		user.setPassword(userInput.nextInt());
		System.out.println("Enter the Name:");
		user.setAcc_Holder_Name(userInput.next());
		System.out.println("Initial amount:");
		user.setCurrent_Amount(userInput.nextLong());
		System.out.println("Enter the mobile number:");
		user.setContactNo(userInput.nextLong());
		System.out.println("Enter mail id:");
		user.setEmailId(userInput.next());
		System.out.println("------------------------");
		System.out.println("Your Account is Created!");
		System.out.println("------------------------");
		PreparedStatement ps = null;
		try {

			ps = JDBC.jdbcConnection().prepareStatement("insert into userInfo values(?,?,?,?,?,?,?)");
			ps.setLong(1, user.getAcc_No());
			ps.setString(2, user.getAcc_Holder_Name());
			ps.setLong(3, user.getCurrent_Amount());
			ps.setLong(4, user.getContactNo());
			ps.setString(5, user.getEmailId());
			ps.setString(6, user.getUser_Name());
			ps.setInt(7, user.getPassword());
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		ps.close();
		Choice choice = new Choice();
		choice.end();
	}

	public void exit() {
		System.out.println("Thank you!!");
	}
}
