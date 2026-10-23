package com.zut;

public class MobileMoneyPayment extends AbstractPaymentMethod {
    // Attributes
    private String phoneNumber;

    public MobileMoneyPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void executePayment(double amount) {
        System.out.println("Sending K" + amount + " request to " + this.phoneNumber);
        System.out.println("Waiting for customer to enter pin...");
    }
}