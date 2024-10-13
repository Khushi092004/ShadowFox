package bankmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String accountHolder;
    private double balance;
    private List<String> transactionHistory;

    // Constructor to initialize account holder and balance
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>(); // Initialize transaction history
        transactionHistory.add("Account created with initial balance: $" + initialBalance);
    }

    // Getter for account holder name
    public String getAccountHolder() {
        return accountHolder;
    }

    // Getter for account balance
    public double getBalance() {
        return balance;
    }

    // Deposit method to add money to the balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: $" + amount + " | New Balance: $" + balance);
        } else {
            throw new IllegalArgumentException("Deposit amount must be greater than zero.");
        }
    }

    // Withdraw method to take money out of the balance
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: $" + amount + " | New Balance: $" + balance);
        } else if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance. Available balance: $" + balance);
        } else {
            throw new IllegalArgumentException("Withdrawal amount must be greater than zero.");
        }
    }

    // Method to return a formatted transaction history
    public List<String> getTransactionHistory() {
        return transactionHistory;
    }

    // Print transaction history
    public void printTransactionHistory() {
        System.out.println("Transaction History for " + accountHolder + ":");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}
