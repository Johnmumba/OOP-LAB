package com.zut;

import java.util.LinkedList;
import java.util.List;

public class _LinkedList {
    public static void main(String[] args) {
        
        List<String> queue = new LinkedList<>();
        queue.add("Ticket 1");
        queue.add("Ticket 3");
        queue.add(1, "Ticket 2");
        System.out.println(queue);
        System.out.println(queue.size());

    }
}
