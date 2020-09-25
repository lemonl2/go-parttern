package com.eoi.pattern.behavior.iterator;

import java.util.List;

/**
 * @author lemon
 */
public class ConcreteIterator implements Iterator {
    private List<Object> list = null;
    private int index = -1;
    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object first() {
        index = 0;
        Object obj = list.get(index);
        return obj;
    }

    @Override
    public Object next() {
        Object object = null;
        if (this.hasNext()) {
            object = list.get(++index);
        }
        return object;
    }

    @Override
    public boolean hasNext() {
        return (index < (list.size() - 1));
    }
}
