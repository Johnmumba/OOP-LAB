package com.zut;

public class CheckingsAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 500.00;

    public CheckingsAccount(String accountHolder, double balance, Customer owner) {
        super(accountHolder, balance, owner);
    }

    @Override
    public void withdraw(double amount) {
        //              0 + 500
        if (amount > this.getBalance() + OVERDRAFT_LIMIT) {
            throw new IllegalArgumentException("Exceeds overdraft limit");
        }
        //          0       - 200
        amount = this.getBalance() - amount; // -300
        this.setBalance(amount);
    }
}
