package Solutions;

public class Account {

	String accountHolder ;
	double balance;
	
	void displayAccount() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
	
	public static void main(String[] args) {
		Account acc = new Account();  // No values set
        acc.displayAccount();

	}

}
