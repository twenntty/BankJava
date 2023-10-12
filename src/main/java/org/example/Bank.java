package org.example;

import javax.security.auth.login.AccountNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<BankAccount> accounts = new ArrayList<>();

    public BankAccount createAccount(String accountName, double initialDeposit) {
        int accountNumber = accounts.size() + 1;
        BankAccount account = new BankAccount(accountNumber, accountName, initialDeposit);
        accounts.add(account);
        return  account;
    }

    public BankAccount findAccount(int accountNumber) throws AccountNotFoundException {
        for(BankAccount account : accounts) {
            if(account.getAccountNumber() == accountNumber) {
                return  account;
            }
        }
        throw  new AccountNotFoundException("Account not found with account number: " + accountNumber);
    }

    public void transferMoney(int fromAccountNumber, int toAccountNumber, double amount)
            throws NegativeAmountException, InsufficientFundsException, AccountNotFoundException {
        BankAccount fromAccount = findAccount(fromAccountNumber);
        BankAccount toAccount = findAccount(toAccountNumber);
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }
}
