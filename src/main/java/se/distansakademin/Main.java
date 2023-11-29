package se.distansakademin;

import se.distansakademin.Account.Account;
import se.distansakademin.Account.AccountManager;

import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		while (true) {
			System.out.println("Main Menu:");
			System.out.println("1. Log In");
			System.out.println("2. Register");
			System.out.println("3. Browse Products");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			
			
			int choice;
			choice = scanner.nextInt();
			
			switch (choice) {
				case 1:
					showLoginMenu();
					break;
				case 2:
					showRegistrationMenu();
					break;
				case 3:
					showProductMenu();
					break;
				case 4:
					System.out.println("Exiting the application. Goodbye!");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choice. Please enter a valid option.");
			}
			
		}
	}
	
	
	private static void showLoginMenu() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Login Menu:");
		
		System.out.print("Enter your login name: ");
		String loginName = scanner.next();
		
		System.out.print("Enter your password: ");
		String password = scanner.next();
		
		// Find the account based on the login name
		Account userAccount = AccountManager.findAccountByLoginName(loginName);
		
		if (userAccount != null && userAccount.getPassword().equals(password)) {
			System.out.println("Login successful! Welcome, " + userAccount.getLoginName());
		} else {
			System.out.println("Login failed. Please check your login name and password.");
			
		}
	}
	
	

	private static void showRegistrationMenu() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Registration Menu:");
		
		System.out.print("Enter your first name: ");
		String firstName = scanner.next();
		
		System.out.print("Enter your last name: ");
		String lastName = scanner.next();
		
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		
		System.out.print("Enter your desired login name: ");
		String loginName = scanner.next();
		
		System.out.print("Enter your desired password: ");
		String password = scanner.next();
		
	
		User newUser = new User(firstName, lastName, age);
		
		
		Account newAccount = new Account(loginName, password, 1, 2000);
		newAccount.addUser(newUser);
		AccountManager.addAccount(newAccount);
		
		System.out.println("Registration successful! Account created for: " + newUser.getFirstName() + " " +
				newUser.getLastName());
		
	}
	
	
	
	
	
	private static void showProductMenu() {
	
	
	}
	
	
	
	
}

