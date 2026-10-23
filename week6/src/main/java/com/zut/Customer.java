package com.zut;

public class Customer {
    private String name;
    private String email;
    private String phone;

    public Customer(String name, String email, String phone) {
        this.email = email;
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }
    
    public String getEmail() {
        return this.email;
    }


}
