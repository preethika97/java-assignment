package Contactmanagement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ContactDetails {

	Scanner sc = new Scanner(System.in);
	ArrayList<Contact> contact = new ArrayList<Contact>();
	Contact contact1 = new Contact(1, "Monisha", "8099090909", "15-06-1998", "monisha@gmail.com", "peravurani");
	Contact contact2 = new Contact(2, "Ananthi", "9080788991", "02-11-1998", "ananthi@gmail.com", "pattukkottai");
	Contact contact3 = new Contact(3, "Madhu", "9090980990", "11-08-1997", "madhu@gmail.com", "thanjavur");
	Contact contact4 = new Contact(4, "Preethi", "8890890900", "28-04-1998", "preethi@gmail.com", "peravurani");
	Contact contact5 = new Contact(5, "Pavithra", "9009944439", "06-06-1998", "pavithra@gmail.com", "pattukkottai");

	public ContactDetails() {
		contact.add(contact1);
		contact.add(contact2);
		contact.add(contact3);
		contact.add(contact4);
		contact.add(contact5);
	}

	public void process() {
		ContactDetails contactdetails = new ContactDetails();
		int choice;
		do {
			System.out.println("***Contact Management***");
			System.out.println("\n1.Add Contact\n2.View Contact\n3.Update Contact\n4.Delete Contact\n5.View All Contact\n6.Exit");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				contactdetails.addContact();
				break;
			case 2:
				contactdetails.viewContact();
				break;
			case 3:
				contactdetails.updateContact();
				break;
			case 4:
				contactdetails.deleteContact();
				break;
			case 5:
				contactdetails.viewAllContact();
				break;
			case 6:
				System.out.println("Thankyou");
				break;
			}

		} while (choice != 6);
	}

	public void addContact() {

		System.out.println("Enter the id:");
		int id = sc.nextInt();
		System.out.println("Enter the name:");
		String name = sc.next();
		System.out.println("Enter the contact Number:");
		String contactNumber = sc.next();
		System.out.println("Enter the DOB:");
		String DOB = sc.next();
		System.out.println("Enter the emailId:");
		String emailid = sc.next();
		System.out.println("Enter the address:");
		String address = sc.next();
		System.out.println("Contact added successfully...");
		Contact c = new Contact(id, name, contactNumber, DOB, emailid, address);
		contact.add(c);
		System.out.println(contact);
	}

	public void viewContact() {
		System.out.println("Enter the id:");
		int id = sc.nextInt();
		for (Contact viewcontact : contact) {
			if (viewcontact.getId() == id)
				System.out.println(viewcontact.getName() + "\n" + viewcontact.getContactNumber() + "\n"
						+ viewcontact.getDOB() + "\n" + viewcontact.getEmailId() + "\n" + viewcontact.getAddress());
		}
	}

	public void updateContact() {

		System.out.println("Enter the id:");
		int id = sc.nextInt();
		System.out.println("Enter the name:");
		String name = sc.next();
		System.out.println("enter the contact Number:");
		String contactNumber = sc.next();
		for (Contact updatecontact : contact) {
			if (updatecontact != null && id == updatecontact.getId()) {
				updatecontact.setName(name);
				updatecontact.setContactNumber(contactNumber);
				System.out.println(updatecontact);
				break;
			}
		}
	}

	public void deleteContact() {
		System.out.println("Enter the id:");
		int id = sc.nextInt();
		for (Contact deletecontact : contact) {
			if (deletecontact.getId() == id) {
				contact.remove(id);
				break;
			}
		}
		System.out.println("Contact removed successfully...");
	}

	public void viewAllContact() {

		for (Contact viewallcontact : contact) {
			System.out.println(contact);
		}
	}
}
