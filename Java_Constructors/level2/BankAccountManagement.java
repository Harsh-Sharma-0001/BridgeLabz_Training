// BankAccountManagement.java

// Base class
class BankAccount {
    public int accountNumber;       // public → accessible everywhere
    protected String accountHolder; // protected → accessible in subclasses
    private double balance;         // private → only inside this class

    // Constructor
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    // Get balance (since balance is private)
    public double getBalance() {
        return balance;
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------------");
    }
}

// Subclass
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Demonstrating access to accountNumber (public) and accountHolder (protected)
    public void showSavingsDetails() {
        System.out.println("Savings Account Number: " + accountNumber);   // public → accessible
        System.out.println("Savings Account Holder: " + accountHolder);   // protected → accessible
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("----------------------------");
    }
}

// Main class
public class BankAccountManagement {
    public static void main(String[] args) {
        // Create BankAccount object
        BankAccount acc1 = new BankAccount(101, "Alice", 5000);
        acc1.displayAccountDetails();

        // Deposit and withdraw
        acc1.deposit(1500);
        acc1.withdraw(2000);
        System.out.println("Final Balance: " + acc1.getBalance());
        System.out.println();

        // Create SavingsAccount object
        SavingsAccount sav1 = new SavingsAccount(202, "Bob", 8000, 5.0);
        sav1.showSavingsDetails();
        sav1.deposit(1000);
        sav1.withdraw(3000);
        System.out.println("Savings Final Balance: " + sav1.getBalance());
    }
}
