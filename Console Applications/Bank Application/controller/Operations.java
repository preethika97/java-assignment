
package controller;

import view.Choice;
import java.sql.SQLException;
import java.util.Scanner;

public class Operations {
	public void mainMenu() throws ClassNotFoundException, SQLException

	{
		Scanner optionInput = new Scanner(System.in);
		System.out.println("1)Login\n2)SignUp\n3)Exit\n");
		int option = optionInput.nextInt();
		Authentication au = new Authentication();
		switch (option) {
		case 1:
			au.login();
			break;
		case 2:
			au.signUp();
			break;
		case 3:
			au.exit();
			break;
		}
	}
}
