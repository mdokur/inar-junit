package week_16.test;

import org.junit.jupiter.api.*;
import week_16.java.BankAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {
    @BeforeAll
    public static void start() {
        System.out.println("Test started");
    }

    @AfterAll
    public static void close() {
        System.out.println("Test finished");
    }

    BankAccount bankAccount;

    @BeforeEach
    void createBankAccountObject() {
        bankAccount = new BankAccount();
        System.out.println("BankAccount object created");
    }

    @AfterEach
    void deletedBankAccountObject() {
        bankAccount = null;
        System.out.println("BankAccount object assigned to the null");
    }

    @Test
    void testDepositIntoAccount() {
        double initialBalance = bankAccount.getBalance();

        double depositAmount = 100;

        bankAccount.deposit(depositAmount);

        double expected = bankAccount.getBalance() - initialBalance;

        assertEquals(expected, depositAmount, "Test case1 failed deposit method of bankAccount class is not working properly");
    }

    @Test
    void testWithdrawFromAccountWithSufficientFunds() {
        double initialBalance = bankAccount.getBalance();

        double depositAmount = 100;

        bankAccount.deposit(depositAmount);

        double withdrawAmount = 50;

        bankAccount.withdraw(withdrawAmount);

        double expected = initialBalance + depositAmount - withdrawAmount;
        assertEquals(expected, bankAccount.getBalance(), "Test case2 failed withdraw method of bankAccount class is not working properly");
    }

    @Test
    void testWithdrawFromAccountExceedingBalance() {
        double initialValue = bankAccount.getBalance();

        assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(initialValue + 1),
                "Test case3 failed Developer forgot to throw IllegalArgumentException n the case of withdrawing amount bigger than balance");
    }

    @Test
    void testDepositNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> bankAccount.deposit(-50),
                "Test case4 failed Developer forgot to throw IllegalArgumentException in the case of depositing negative value");
    }

    @Test
    void testWithdrawNegativeAmount() {
        assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(-50),
                "Test case5 failed Developer forgot to throw IllegalArgumentException in the case of withdrawing negative value");

    }
}
