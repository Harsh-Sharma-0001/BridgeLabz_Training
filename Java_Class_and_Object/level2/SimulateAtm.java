
class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor to initialize the account
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money if sufficient balance exists
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.printf("Current balance: $%.2f\n", balance);
    }

    // Optional: display account details
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        displayBalance();
    }
}

public class SimulateAtm {
    public static void main(String[] args) {
        // Create a BankAccount object with initial balance
        BankAccount myAccount = new BankAccount("John Doe", "1234567890", 1000.0);

        // Display initial account info
        myAccount.displayAccountInfo();

        // Deposit money
        myAccount.deposit(500);

        // Withdraw money
        myAccount.withdraw(200);

        // Try to withdraw more than the balance
        myAccount.withdraw(2000);

        // Display final balance
        myAccount.displayBalance();
    }
}
