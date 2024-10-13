package bankmanagementsystem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import java.util.List;

class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp() {
        // Initialize a new bank account for testing before each test
        account = new BankAccount("Khushi Jangir", 1000.0);
    }

    @Test
    void testInitialBalance() {
        // Verify the initial balance is set correctly
        assertEquals(1000.0, account.getBalance(), "Initial balance should be 1000.0");
    }

    @Test
    void testDeposit() {
        // Test a valid deposit
        account.deposit(500);
        assertEquals(1500.0, account.getBalance(), "Balance should be 1500.0 after depositing 500");

        // Test invalid deposit
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-100);
        });
        assertEquals("Deposit amount must be greater than zero.", exception.getMessage());
    }

    @Test
    void testWithdraw() {
        // Test a valid withdrawal
        account.withdraw(300);
        assertEquals(700.0, account.getBalance(), "Balance should be 700.0 after withdrawing 300");

        // Test insufficient balance
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(800);
        });
        assertEquals("Insufficient balance. Available balance: $700.0", exception.getMessage());

        // Test invalid withdrawal
        exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-50);
        });
        assertEquals("Withdrawal amount must be greater than zero.", exception.getMessage());
    }

    @Test
    void testTransactionHistory() {
        // Test transaction history
        account.deposit(200);
        account.withdraw(100);
        
        List<String> history = account.getTransactionHistory();
        assertEquals(3, history.size(), "Transaction history should contain 3 entries");
        assertTrue(history.contains("Account created with initial balance: $1000.0"));
        assertTrue(history.contains("Deposited: $200.0 | New Balance: $1200.0"));
        assertTrue(history.contains("Withdrew: $100.0 | New Balance: $1100.0"));
    }

    @Test
    void testPrintTransactionHistory() {
        // This test could be manually verified by checking the console output
        account.deposit(200);
        account.withdraw(100);
        account.printTransactionHistory(); // Expected to print the history to the console
    }
}
