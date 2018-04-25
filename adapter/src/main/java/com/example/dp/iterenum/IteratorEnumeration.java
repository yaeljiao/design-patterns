package com.example.dp.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 将Iterator通过适配器模式伪装成Enumeration
 *
 * @author zhichao
 */
public class IteratorEnumeration implements Enumeration {
    Iterator iterator;

    public IteratorEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }


    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
