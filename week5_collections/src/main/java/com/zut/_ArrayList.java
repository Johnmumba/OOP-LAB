package com.zut;

import java.util.ArrayList;
import java.util.List;

public class _ArrayList {
    public static void main(String[] args) {
        List<String> contacts = new ArrayList<>();
        contacts.add("Mary - 091");
        contacts.add("Jacob - 092");
        contacts.add("El - 093");
        contacts.add("Fred - 094");
        contacts.add(1, "Alex - 097");

        System.out.println("Before Deleting Fred");
        System.out.println(contacts);
        contacts.remove("Fred - 094");
        System.out.println("After Deleting Fred");
        System.out.println(contacts);

    }
}
