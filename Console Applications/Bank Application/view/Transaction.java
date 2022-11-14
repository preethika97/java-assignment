package view;

import model.User;
import java.sql.*;
import java.util.Scanner;

public class Transaction {

	public void withdrawal() throws ClassNotFoundException, SQLException {
		Scanner userInput = new Scanner(System.in);
		User user = new User();
		System.out.println("Enter the Acconut Number:");
		user.setAcc_No(userInput.nextLong());
		System.out.println("Enter the amount:");
		int amt = userInput.nextInt();
		try {

			PreparedStatement ps = JDBC.jdbcConnection()
					.prepareStatement("select Current_Amount from userInfo  where Acc_No=? ");
			ps.setLong(1, user.getAcc_No());
			ResultSet rs = ps.executeQuery();
			rs.next();
			long balance = rs.getLong(1);
			if (balance > (amt + 1000)) {
				PreparedStatement ps1 = JDBC.jdbcConnection().prepareStatement(
						"update userInfo set Current_Amount=Current_Amount-" + amt + " where Acc_No=?");
				ps1.setLong(1, user.getAcc_No());
				int i = ps1.executeUpdate();
				PreparedStatement ps2 = JDBC.jdbcConnection()
						.prepareStatement("select Current_Amount from userInfo  where Acc_No=? ");
				ps2.setLong(1, user.getAcc_No());
				ResultSet rs3 = ps2.executeQuery();
				rs3.next();
				System.out.println(
						amt + " is withdrawed from your account\n" + "\nbalance=" + rs3.getLong("Current_Amount"));

			} else {
				System.out.println("Insufficient balance...");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		Choice choice = new Choice();
		choice.end();
	}

	public void deposit() throws ClassNotFoundException, SQLException {
		Scanner userInput = new Scanner(System.in);
		User user = new User();
		System.out.println("Enter the Account Number:");
		user.setAcc_No(userInput.nextLong());
		System.out.println("Enter the amount:");
		int amt = userInput.nextInt();
		try {
			PreparedStatement ps = JDBC.jdbcConnection()
					.prepareStatement("update userInfo set Current_Amount =Current_Amount+" + amt + " where Acc_No=?");
			ps.setLong(1, user.getAcc_No());
			long i = ps.executeUpdate();
			PreparedStatement ps1 = JDBC.jdbcConnection()
					.prepareStatement("select Current_Amount from userInfo  where Acc_No=? ");
			ps1.setLong(1, user.getAcc_No());
			ResultSet result = ps1.executeQuery();
			result.next();
			System.out.println(amt + " is depited to Account Number: " + user.getAcc_No() + " account\n"
					+ "Available balance=" + result.getLong("Current_Amount"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		Choice choice = new Choice();
		choice.end();
	}

	public void balance_Enquiry() throws ClassNotFoundException, SQLException {
		Scanner userInput = new Scanner(System.in);
		User user = new User();
		System.out.println("Enter the Account Number:");
		user.setAcc_No(userInput.nextLong());
		try {
			PreparedStatement ps = JDBC.jdbcConnection()
					.prepareStatement("select Current_Amount from userInfo  where Acc_No=? ");
			ps.setLong(1, user.getAcc_No());
			ResultSet result = ps.executeQuery();
			result.next();
			System.out.println("Available balance=" + result.getLong("Current_Amount"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		Choice choice = new Choice();
		choice.end();
	}
}
