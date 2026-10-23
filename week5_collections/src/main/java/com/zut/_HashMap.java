package com.zut;

import java.util.HashMap;
import java.util.Map;

public class _HashMap {
    public static void main(String[] args) {
        Map<String, Contact> phoneBook = new HashMap<>();
        phoneBook.put("097", new Contact("Jacob", "097"));
        phoneBook.put("096", new Contact("Mary", "096"));

        // System.out.println(phoneBook);
        /*
        This will give null pointer exception
        Contact found = phoneBook.get("095");
        System.out.println(found.getName());
         */

        Contact found = phoneBook.get("097");
        System.out.println(found.getName());

        // Iterate
        for(Map.Entry<String, Contact> entry: phoneBook.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue().getName());
        }
    }
}
