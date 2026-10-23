package com.zut;

public class Checkout {
    public void processOrder(Object paymentMethod, double amount) {
        if (paymentMethod instanceof MobileMoneyPayment) {
            ((MobileMoneyPayment) paymentMethod).pay(amount);
        } else if (paymentMethod instanceof CardPayment) {
            ((CardPayment) paymentMethod).pay(amount);
        } else if (paymentMethod instanceof CashPayment) {
            ((CashPayment) paymentMethod).pay(amount);
        } else {
            System.out.println("Unknown payment method...");
        }
    }
}
