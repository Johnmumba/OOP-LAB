package com.zut;

import java.util.HashSet;
import java.util.Set;

public class _HashSet {
    public static void main(String[] args) {
        
        Set<Contact> phoneNumbers = new HashSet<>();
        phoneNumbers.add(new Contact("Jacob", "091"));
        phoneNumbers.add(new Contact("Jacob", "091"));
        System.out.println(phoneNumbers);
    }
}
