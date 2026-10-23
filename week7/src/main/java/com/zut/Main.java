package com.zut;

public class Main {
    public static void main(String[] args) {

        Checkout c = new Checkout();
        // c.processOrder(new MobileMoneyPayment("0965"), 500);
        c.processOrder(new CardPayment("9090 8788 7767 7767"), 1000);
    }
}