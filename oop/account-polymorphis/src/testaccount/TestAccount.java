package testaccount;

import com.techlabs.account.*;

public class TestAccount {
	public static void main(String[] args) {
		SavingAccount savingaccount = new SavingAccount(123, "manish", 1000);
		CurrentAccount currentaccount = new CurrentAccount(234, "darshan", 3000);
		printdetails(savingaccount);
		printdetails(currentaccount);
		currentaccount.withdraw(5000);
		
	}
	public static void printdetails(Account acc) {
		System.out.println("account_numeber="+acc.getaccountHolderName());
		System.out.println("account_holder_name="+acc.getAccountNumber());
		System.out.println("balance"+acc.getBalance());
	}
	

}
