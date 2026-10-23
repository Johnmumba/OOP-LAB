package com.zut;

public class CardPayment {
    private String cardNumber;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void pay(double amount) {
        System.out.println("Charging k" + amount + " to customer with card number " + this.cardNumber.substring(0, 4));
    }
}