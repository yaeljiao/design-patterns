package com.example.dp.iterenum;

import java.util.Iterator;
import java.util.Vector;

public class EnumerationIteratorTest {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("a");
        vector.add("b");
        vector.add("c");

        Iterator iterator= new EnumerationIterator(vector.elements());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
