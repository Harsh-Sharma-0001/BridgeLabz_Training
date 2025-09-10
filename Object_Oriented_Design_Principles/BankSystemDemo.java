import java.util.*;

class Customer {
    private String name;
    private List<BankAccount> accounts = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void viewBalances() {
        System.out.println("Customer: " + name);
        for (BankAccount account : accounts) {
            System.out.println("Account in " + account.getBank().getName() + ": $" + account.getBalance());
        }
    }
}

class Bank {
    private String name;
    private List<BankAccount> accounts = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public BankAccount openAccount(Customer customer, double initialDeposit) {
        BankAccount account = new BankAccount(this, customer, initialDeposit);
        accounts.add(account);
        customer.addAccount(account);
        return account;
    }
}

class BankAccount {
    private Bank bank;
    private Customer customer;
    private double balance;

    public BankAccount(Bank bank, Customer customer, double balance) {
        this.bank = bank;
        this.customer = customer;
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankSystemDemo {
    public static void main(String[] args) {
        Bank bank1 = new Bank("National Bank");
        Customer cust1 = new Customer("Alice");

        bank1.openAccount(cust1, 1000.0);
        bank1.openAccount(cust1, 2000.0);

        cust1.viewBalances();
    }
}
