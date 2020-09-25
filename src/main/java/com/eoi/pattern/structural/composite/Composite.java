package com.eoi.pattern.structural.composite;

import java.util.ArrayList;

/**
 * @author lemon
 */
public class Composite implements Component {
    private ArrayList<Component> list = new ArrayList<>();

    @Override
    public void add(Component c) {
        list.add(c);
    }

    @Override
    public void remove(Component c) {
        list.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return list.get(i);
    }

    @Override
    public void operation() {
        for(Component component: list) {
            component.operation();
        }
    }
}
