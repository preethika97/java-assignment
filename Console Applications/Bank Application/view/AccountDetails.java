package view;

import java.util.Scanner;
import java.sql.*;
import model.User;

public class AccountDetails {
	public void show_Account() throws ClassNotFoundException, SQLException {
		Scanner userInput = new Scanner(System.in);
		User user = new User();
		System.out.println("enter Account Number:");
		user.setAcc_No(userInput.nextLong());
		try {
			PreparedStatement ps = JDBC.jdbcConnection().prepareStatement("select * from userInfo where Acc_No=?");
			ps.setLong(1, user.getAcc_No());
			ResultSet rs = ps.executeQuery();
			if (rs.next())
				System.out.println(
						"Account_Number:" + rs.getLong("Acc_No") + "\nAccount_Holder:" + rs.getString("Acc_Holder_Name")
								+ "\n" + "Balance:" + rs.getLong("Current_Amount") + "\n" + "Mobile_Number:"
								+ rs.getLong("ContactNo") + "\n" + "mail_id:" + rs.getString("EmailId") + "\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Choice choice = new Choice();
		choice.end();
	}
}
