package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import se.distansakademin.Account.Account;
import se.distansakademin.Account.AccountManager;
import se.distansakademin.User;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class Account_StepDef {
	
	Scanner scanner = new Scanner(System.in);
	
	//Account information
	private String loginName;
	private String password;
	
	
	private String registrationConfirmation;
	
	
	@Given("the user is on the registration page,")
	public void theUserIsOnTheRegistrationPage() {
		
		System.out.println("Welcome to the Registration page");
		
	}
	
	@When("the user fills in valid registration details,")
	public void theUserFillsInValidRegistrationDetails() {
		
		
		String firstName = "John";
		String lastName = "Doe";
		int age = 25;
		
		loginName = "john.doe";
		password = "password123";
		
	
		User newUser = new User(firstName, lastName, age);
		
		Account newAccount = new Account(loginName, password, 2000, 1);
		newAccount.addUser(newUser);
		AccountManager.addAccount(newAccount);
		
		
		registrationConfirmation = "Registration successful! Account created for: " + newUser.getFirstName() + " "
				+ newUser.getLastName();
	}
	
	
	@Then("an account should have been created and confirmation will be printed to the user.")
	public void anAccountShouldHaveBeenCreatedAndConfirmationWillBePrintedToTheUser() {
		assertNotNull(AccountManager.findAccountByLoginName(loginName), "User account should not be null");
		assertEquals(registrationConfirmation, "Registration successful! Account created for: John Doe");
	}
	
	
	
	@Given("The user is on the login page,")
	public void theUserIsOnTheLoginPage() {
		
		System.out.println("Welcome to the login page");
		
	}
	
	@When("the user fills in correct login details,")
	public void theUserFillsInCorrectLoginDetails() {
		
		loginName = "john.doe";
		password = "password123";
		
		
	}
	
	
	@Then("the user should be able to login and get a login confirmation.")
	public void theUserShouldBeAbleToLoginAndGetALoginConfirmation() {
		
		Account userAccount = AccountManager.findAccountByLoginName(loginName);
		
		String loginConfirmation;
		boolean isLoggedIn;
		
		if (userAccount != null && userAccount.getPassword().equals(password)) {
			
			loginConfirmation = "Login successful! Welcome, " + userAccount.getLoginName();
			isLoggedIn = true;
			
		} else {
			
			loginConfirmation = "Login failed. Please check your login name and password.";
			isLoggedIn = false;
		}
		
		assertEquals("Login successful! Welcome, john.doe", loginConfirmation);
		assertTrue(isLoggedIn, "User should be logged in");
		
	}
	
	
}