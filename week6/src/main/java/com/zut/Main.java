package com.zut;

public class Main {
    public static void main(String[] args) {
        Customer chanda = new Customer("Chanda", "chanda@yahoo.com", "0976");
        CheckingsAccount acc1 = new CheckingsAccount("MJ", 200, chanda);

        // acc1.withdraw(600);
        acc1.getOwnerName();


        
    }
}