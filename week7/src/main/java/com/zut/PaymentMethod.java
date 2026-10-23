package com.zut;

public interface PaymentMethod {
    public void pay(double amount);
    public void logTransaction();
}
