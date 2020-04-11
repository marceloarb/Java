
public class AccountTest {
	public static void main(String[] args) {
		Account member1 = new Account();
		Account member2 = new Account();
		member1.accountDeposit("checking",600.00);
		member2.accountDeposit("checking",200.00);
		member1.accountDeposit("savings",600.00);
		member2.accountDeposit("savings",200.00);
		member1.withdraw("checking", 100.00);
		member2.withdraw("savings", 100.00);
		member1.saldo();
		member2.saldo();
		
	}
}
