package org.example;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String message) {
        super(message);
    }
}

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        try {
            BankAccount account1 = bank.createAccount("Alice", 1000);
            BankAccount account2 = bank.createAccount("Bob", 500);

            System.out.println(account1.getAccountSummary());
            System.out.println(account2.getAccountSummary());

            bank.transferMoney(1, 2, 300);

            System.out.println(account1.getAccountSummary());
            System.out.println(account2.getAccountSummary());

            bank.transferMoney(1, 2, -100);
        } catch (NegativeAmountException | InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (javax.security.auth.login.AccountNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
