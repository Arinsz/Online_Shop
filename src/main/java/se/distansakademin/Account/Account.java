package se.distansakademin.Account;

import se.distansakademin.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Account implements IAccount {
	
	List<User> userList = new ArrayList<>();
	
	private String LoginName;
	private String Password;
	private int balance;
	
	private int accountId;
	private static int nextAccountId = 1;
	
	
	public Account(String loginName, String password, int balance, int accountId) {
		
		LoginName = loginName;
		Password = password;
		this.balance = balance;
		this.accountId = nextAccountId ++;
	
	}
	
	@Override
	public void addUser(User user) {
		
		if (!ifUserExists(user) && validateUser(user)) {
			userList.add(user);
			System.out.println("User added successfully.");
		} else {
			System.out.println("User not added. User already exists or validation failed.");
		}
	}
	
	
	@Override
	public void removeUser(User user) {
		
		userList.remove(user);
	}
	
	@Override
	public boolean ifUserExists(User user) {
		
		return userList.contains(user);
	}
	
	@Override
	public void updateUser(User updatedUser) {
		
		for (User existingUser : userList) {
			if (Objects.equals(existingUser.getFirstName(), updatedUser.getFirstName())) {
				existingUser.setFirstName(updatedUser.getFirstName());
				existingUser.setLastName(updatedUser.getLastName());
				existingUser.setAge(updatedUser.getAge());
				break;
			}
		}
		
	}
	
	@Override
	public boolean validateUser(User user) {
		
		if (user.getFirstName() == null || user.getFirstName().isEmpty()) {
			System.out.println("Firstname is empty");
			return false;
		}
		
		if (user.getLastName() == null || user.getLastName().isEmpty()) {
			System.out.println("Lastname is empty");
			return false;
		}
		
		if (user.getAge() <= 0 ) {
			System.out.println("Age cant be under 0");
			return false;
		}
		
		return true;
		
	}
	
	
	
	public int getBalance() {
		
		return balance;
	}
	
	public void setBalance(int balance) {
		
		this.balance = balance;
	}
	
	public static int getNextAccountId() {
		
		return nextAccountId;
	}
	
	public static void setNextAccountId(int nextAccountId) {
		
		Account.nextAccountId = nextAccountId;
	}
	
	public String getPassword() {
		
		return Password;
	}
	
	public void setPassword(String password) {
		
		Password = password;
	}
	
	public int getAccountId() {
		
		return accountId;
	}
	
	public void setAccountId(int accountId) {
		
		this.accountId = accountId;
	}
	
	public String getLoginName() {
		
		return LoginName;
	}
	
	public void setLoginName(String loginName) {
		
		LoginName = loginName;
	}
	
	
	public List<User> getUserList() {
		
		return userList;
	}
	
	

}



	
