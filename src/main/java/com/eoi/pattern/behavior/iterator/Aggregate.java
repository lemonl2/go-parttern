package com.eoi.pattern.behavior.iterator;

/**
 * @author lemon
 */
public interface Aggregate {
    void add(Object obj);
    void remove(Object obj);
    Iterator getIterator();
}
