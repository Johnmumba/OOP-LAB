package com.zut;

public class Main {
    public static void main(String[] args) {
        BankAccout jacobsAccout = new BankAccout(); // instantiation

        jacobsAccout.accountHolder = "Jacob";
        jacobsAccout.balance = 100;

        System.out.println("Before Deposit: " + jacobsAccout.balance);
        jacobsAccout.deposit(100);
        System.out.println("After Deposit: " + jacobsAccout.balance);
    }
}
