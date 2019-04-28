
public class CurrentAccount  extends Account {

	CurrentAccount(double account_number, String account_holder_name, double balance) {
		super(account_number, account_holder_name, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) {
		if(balance-amount>=-2000 ) {
			balance = balance -amount;
			System.out.println("withdrwa success");
		}
		// TODO Auto-generated method stub
		else {
			System.out.println("withdrwa cancel");
		}
	}

}
