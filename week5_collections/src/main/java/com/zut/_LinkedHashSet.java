package com.zut;

import java.util.LinkedHashSet;
import java.util.Set;

public class _LinkedHashSet {
    public static void main(String[] args) {
        
        Set<String> names = new LinkedHashSet<>();
        names.add("Jacob");
        names.add("Jane");
        names.add("Ben");
        names.add("Jacob");
        System.out.println(names);

    }
}
