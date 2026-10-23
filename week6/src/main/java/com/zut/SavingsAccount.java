package com.zut;

public class SavingsAccount extends BankAccount {
    private int withdrawsThisMonth = 0;
    private static final int MONTHLY_LIMIT = 3;
    private static final double INTEREST_RATE = 0.02;

    public SavingsAccount(String accountHolder, double balance, Customer owner) {
        super(accountHolder, balance, owner);
    }
    
    @Override 
    public void withdraw(double amount) {
        if (withdrawsThisMonth >= MONTHLY_LIMIT) {
            throw new IllegalStateException("Monthly withdraw limit reached");
        }
        super.withdraw(amount);
        withdrawsThisMonth++;
    }

    public void applyInterest() {
        double actual_balance = this.getBalance();
        actual_balance += actual_balance * INTEREST_RATE;
        setBalance(actual_balance);
    }
    
}
