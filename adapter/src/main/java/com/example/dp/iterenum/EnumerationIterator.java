package com.example.dp.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 将Enumeration通过适配器模式伪装成Iterator
 *
 * @author zhichao
 */
public class EnumerationIterator implements Iterator {
    private Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
