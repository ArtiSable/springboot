package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SavingsAccountTest {
    Account account;
    double delta = 0.001;

    @BeforeEach
    void setUp() throws Exception {
        account = new Account("John", 1234, 5000);
    }

    @AfterEach
    void tearDown() throws Exception {
        account = null;
    }

    @Test
    void depositTest() {
        account.deposit(500);
        assertEquals(5500, account.getBalance(), delta, "Deposit Test");
    }

    @Test
    void withdrawTest() {
        account.withdraw(500);
        assertEquals(4500.0, account.getBalance(), delta, "Withdraw Test");
    }

    @Test
    void createAccountTest() {
        account.createAccount("Jane", 5678, 3000);
        assertEquals("Jane", account.getName(), "Create Account Test - Name");
        assertEquals(5678, account.getAccountNumber(), "Create Account Test - Account Number");
        assertEquals(3000, account.getBalance(), delta, "Create Account Test - Balance");
    }
}
