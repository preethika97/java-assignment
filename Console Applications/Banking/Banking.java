package BankApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class Banking {
	Scanner sc = new Scanner(System.in);
	ArrayList<Customers> user = new ArrayList<Customers>();

	Banking() {
		user.add(new Customers("Preethi", "preethi@gmail.com", "preethi*12", 23, "F"));
	}

	public void signup() {

		System.out.println("Enter Name: ");
		String name = sc.next();
		System.out.println("Enter emailid : ");
		String id = sc.next();
		System.out.println("Enter Password: ");
		String pass = sc.next();
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		System.out.println("Enter Gender: ");
		String gender = sc.next();
		user.add(new Customers(name, id, pass, age, gender));

		System.out.println("welcome..! " +name);
		System.out.println();
	}

	public void login() {
		boolean c = false;
		BankAccount ba=new BankAccount();
		System.out.println("Enter emailid : ");
		String id = sc.next();
		System.out.println("Enter Password: ");
		String pass = sc.next();
		for (Customers a : user) {
			if (a.getEmailid().equals(id) && a.getPassword().equals(pass)) {
				c= true;
			}

		}
		System.out.println(c== true ? "Welcome" : "Sorry Wrong Credentials");
         if(c==true)
        	 ba.operation();
	}

}
