import java.util.Random;
public class Account {
//	Attributes
	private String accountNumber = "";
	private Double checkingBalance = 0.0;
	private Double savingsBalance = 0.0;
	private static int accounts = 0;
	private int totalAmount = 0;
//	Constructors
	public  Account() {
		this.accountNumber = Integer.toString(newAccountNumber());
		this.checkingBalance = 0.0;
		this.savingsBalance = 0.0;
		this.accounts++;
		System.out.println("New user created with account number: " + accountNumber + ".");
		System.out.println("Total accounts created: " + accounts + ".");	
	}
//	Getters
	public Double getChecking() {
		return checkingBalance;
	}
	public Double getSavings() {
		return savingsBalance;
	}
	private int newAccountNumber() {
		Random rand = new Random();
		int random = rand.nextInt(999999999);
		return random;
	}
	public void accountDeposit(String type, Double amount) {
		if(type == "checking") {
			this.checkingBalance += amount;
			this.totalAmount += amount;
		}
		if(type == "savings") {
			this.savingsBalance += amount;
			this.totalAmount += amount;
		}
	}
	public void withdraw(String type, Double amount) {
		if(type == "checking" ) {
			if(getChecking()>amount) {
				this.checkingBalance -= amount;
				this.totalAmount -= amount;
			}
			else {
				System.out.println("You dont have money");
			}
			
		}
		if(type == "savings") {
			if(getSavings()>amount) {
				this.checkingBalance -= amount;
				this.totalAmount -= amount;
			}else {
				System.out.println("You dont have money");
			}
		}
		else {
			System.out.println("Type checkings or savings to complete transaction");
		}
	}
	public void saldo() {
		System.out.println(this.totalAmount);
	}
	
}
