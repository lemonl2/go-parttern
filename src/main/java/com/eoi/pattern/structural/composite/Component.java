package com.eoi.pattern.structural.composite;

public interface Component {
    void add(Component c);
    void remove(Component c);
    Component getChild(int i);
    void operation();
}
