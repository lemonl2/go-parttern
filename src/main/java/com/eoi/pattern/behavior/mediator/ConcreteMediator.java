package com.eoi.pattern.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lemon
 */
public class ConcreteMediator extends Mediator {
    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        for (Colleague colleague1: colleagues) {
            if (!colleague1.equals(colleague)) {
                colleague1.receive();
            }
        }
    }
}
