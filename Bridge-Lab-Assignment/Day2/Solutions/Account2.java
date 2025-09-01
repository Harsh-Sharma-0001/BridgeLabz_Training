package Solutions;
public class Account2 {
	int balance;
	
	void deposite(int amount) {
		balance += amount;
		
		System.out.println("Deposite : " + amount);
	}
	
	void withdrawl(int amount) {
		 if (balance >= amount) {
	            balance -= amount;   // modify instance variable
	            System.out.println("Withdrew: " + amount);
	            
	        } else {
	            System.out.println("Insufficient balance!");
	        }
	    }
	
	void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
	
	public static void main(String[] args) {
		
		Account2 acc = new Account2();

        acc.showBalance();   
        acc.deposit(1000);    
        acc.showBalance();    
        acc.withdraw(400);    
        acc.showBalance();

	}

}
