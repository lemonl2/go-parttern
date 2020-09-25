package com.eoi.pattern.behavior.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author lemon
 */
public class ObjectStructure {
    private List<Element> list = new ArrayList<>();

    public void accept(Visitor visitor) {
        Iterator<Element> i = list.iterator();
        while (i.hasNext()) {
            i.next().aceept(visitor);
        }
    }

    public void add(Element element) {
        list.add(element);
    }

    public void remove(Element element) {
        list.remove(element);
    }
}
