package com.zut;

import java.util.Set;
import java.util.TreeSet;

public class _TreeSet {
    public static void main(String[] args) {
        
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(100);
        numbers.add(50);
        numbers.add(1);
        numbers.add(-10);
        System.out.println(numbers);
    }
}
