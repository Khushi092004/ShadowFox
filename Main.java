package bankmanagementsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a bank account with an initial balance
        BankAccount account = new BankAccount("Khushi Jangir", 1000);
        
        // Display the initial balance
        System.out.println("Initial Balance: $" + account.getBalance());

        // Interactive user input
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Menu loop
        while (running) {
            System.out.println("\nBank Account Management System");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1: // Deposit
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    try {
                        account.deposit(depositAmount);
                        System.out.println("Deposited: $" + depositAmount);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2: // Withdraw
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    try {
                        account.withdraw(withdrawAmount);
                        System.out.println("Withdrawn: $" + withdrawAmount);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3: // Check Balance
                    System.out.println("Current balance: $" + account.getBalance());
                    break;

                case 4: // View Transaction History
                    account.printTransactionHistory();
                    break;

                case 5: // Exit
                    System.out.println("Exiting...");
                    running = false;
                    break;

                default: // Invalid choice
                    System.out.println("Invalid choice. Please select again.");
            }
        }

        // Display transaction history after user interaction ends
        account.printTransactionHistory();
        scanner.close();
    }
}
