package se.distansakademin.Account;
import java.util.ArrayList;
import java.util.List;

public class AccountManager {


	static List <Account> accountList = new ArrayList<>();
	
	
	public static void addAccount(Account account){
		accountList.add(account);
	}
	
	public static Account findAccountByLoginName(String loginName) {
		
		for (Account account : accountList){
			
			if(account.getLoginName().equalsIgnoreCase(loginName)){
				
				return  account;
			}
		}
		
		System.out.println("No matching account found");
		
		return null;
	}
}
