package org.example;

class BankAccount {
    private int accountNumber;
    private String accountName;
    private double balance;

    public BankAccount(int accountNumber, String accountName, double initialDeposit){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = initialDeposit;
    }

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

    public double getBalance() {
        return balance;
    }


    public String getAccountSummary() {
        return "Account Number: " + accountNumber + ", Account Name: " + accountName + ", Balance: " + balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}