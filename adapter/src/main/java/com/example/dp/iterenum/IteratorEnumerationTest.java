package com.example.dp.iterenum;

import java.util.ArrayList;
import java.util.Enumeration;

public class IteratorEnumerationTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");

        Enumeration enumeration = new IteratorEnumeration(arrayList.iterator());

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
