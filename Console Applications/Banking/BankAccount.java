
package BankApplication;

import java.util.Scanner;

class BankAccount {
	Banking a = new Banking();
	Scanner sc = new Scanner(System.in);

	BankAccount() {
	}

	int balance;
	int previousTransaction;

	void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}

	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}

	void getPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited : " + previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("Withdrow : " + Math.abs(previousTransaction));
		} else {
			System.out.println("No Transaction Occured");
		}
	}

	void showMenu() {

		boolean b = true;
		while (b) {
			System.out.println("welcome..!\n 1.SignUp\n 2.Login\n 3.Exit\n");

			int choice = sc.nextInt();

			switch (choice) {
			case 1: {
				a.signup();

				break;

			}
			case 2: {
				a.login();
				operation();

				break;
			}
			case 3: {
				b=false;
				break;
			}
			}
		}

	}

	public void operation() {
		int option;
		do {
			System.out.println("1-Check Your Balance");
			System.out.println("2-Deposit");
			System.out.println("3-Withdraw");
			System.out.println("4-Previous Transaction");
			System.out.println("5-Exit \n");
			System.out.print("Enter Your Option : ");
			option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("-----");
				System.out.println("Balance = " + balance);
				System.out.println("-----");
				break;
			case 2:
				System.out.print("Enter an amount to deposit :");
				int amount1 = sc.nextInt();
				deposit(amount1);
				System.out.println("-----");
				getPreviousTransaction();
				System.out.println("-----");
				break;
			case 3:
				System.out.print("Enter an amount to withdraw :");
				int amount2 = sc.nextInt();
				withdraw(amount2);
				System.out.println("-----");
				getPreviousTransaction();
				System.out.println("-----");
				break;
			case 4:
				System.out.println("-----");
				getPreviousTransaction();
				System.out.println("-----");
			}

		} while (option < 5);
		System.out.println("Thankyou for using our services...");

	}
}
