
package view;

import java.sql.*;
import java.util.Scanner;
import controller.Operations;

public class Choice {
	public void secondPage() throws ClassNotFoundException, SQLException {
		Scanner processOption = new Scanner(System.in);
		System.out.println("1)Show Account\n2)Balance Enquiry\n3)Deposit\n4)Withdrawal\n5)Exit\n");
		int choice = processOption.nextInt();
		Transaction trans = new Transaction();
		AccountDetails ac = new AccountDetails();
		switch (choice) {
		case 1:
			ac.show_Account();
			break;
		case 2:

			trans.balance_Enquiry();
			break;
		case 3:

			trans.deposit();
			break;
		case 4:

			trans.withdrawal();
			break;
		case 5:
			Operations op = new Operations();
			op.mainMenu();
			break;
		}
	}

	public void end() throws ClassNotFoundException, SQLException {
		Scanner terminateOption = new Scanner(System.in);
		Operations ob1 = new Operations();
		System.out.println("Do you want to continue...");
		System.out.println("1)Yes\t2)No");
		int choice = terminateOption.nextInt();

		if (choice == 1)
			secondPage();
		else
			System.out.println("Thank you!!");
	}
}
