package com.zut;

public class BankAccount {
    // Attributes - instance variables - data 
    String accountHolder;
    public double balance;

    //state or behaviour
    public void deposit(double amount){
        this.balance = this.balance + amount;
    }

    void withdraw(double amount) {
        if (amount > this.balance){
            System.out.println("Insufficient funds...")
            return;
        }
        this.balance = this.balance - amount;
    }
}
