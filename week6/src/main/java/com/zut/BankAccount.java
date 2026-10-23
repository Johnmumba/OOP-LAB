package com.zut;

public class BankAccount {
    // Attributes - instance variables - data
    private String accountHolder;
    private double balance;
    private Customer owner;

    public BankAccount(String accountHolder, double balance, Customer owner) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.owner = owner;
    }
    
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Can't deposit negative amount");
        }
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {
       
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        this.balance = this.balance - amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double amount) {
        this.balance = amount; // this.balance = this.balance - amount;
    }

    public String getOwnerName() {
        return this.owner.getName();
    }
}
