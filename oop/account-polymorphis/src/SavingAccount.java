
public class SavingAccount extends Account {

	SavingAccount(double account_number, String account_holder_name, double balance) {
		super(account_number, account_holder_name, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) {
		if (this.balance - amount >= 500) {
			balance = balance - amount;
			System.out.println("withdrwa success");

		}
		else {
			System.out.println("withdrwa cancel");
		}
		// TODO Auto-generated method stub

	}

}
