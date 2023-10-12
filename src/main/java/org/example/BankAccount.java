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

    public double getBalance() {
        return balance;
    }


    public String getAccountSummary() {
        return "Account Number: " + accountNumber + ", Account Name: " + accountName + ", Balance: " + balance;
    }
}