package com.zut;

public class Problem {
    public static void main(String[] args) {
        try {
            String[] contact = new String[1];
            contact[0] = "Mary - 091";
            int contact_arr_len = contact.length;
            String[] contacts = new String[contact_arr_len + 1]; // 2
            System.arraycopy(contact, 0, contacts, 0, contact_arr_len);
            contacts[1] = "Jacob - 092";
            int contacts_arr_len = contacts.length;
            String[] contactsV2 = new String[contacts_arr_len + 1];
            System.arraycopy(contacts, 0, contactsV2, 0, contacts_arr_len);
            contactsV2[2] = "El - 093";
            // contactsV2[3] = "Fred - 094";
    
            for(String c: contactsV2) {
                System.out.println(c);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Problem in array: " + e.getMessage());
        }
    }
}