package se.distansakademin.Account;

import se.distansakademin.User;

import java.util.List;

public interface IAccount {
	
	void addUser(User user);
	void removeUser(User user);
	boolean ifUserExists(User user);
	boolean validateUser(User user);
	void updateUser(User user);
	
	
}
