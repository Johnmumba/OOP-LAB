package com.zut;

public abstract class AbstractPaymentMethod implements PaymentMethod {

    @Override 
    public final void pay(double amount) {
        logTransaction();
        executePayment(amount);
    }

    private void logTransaction(double amount) {
        System.out.println("[LOG] -> Transaction with amount k" + amount + " logged...");
    }

    protected abstract void executePayment(double amount);
    
}
