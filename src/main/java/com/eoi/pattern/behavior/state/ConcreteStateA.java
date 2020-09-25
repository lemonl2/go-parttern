package com.eoi.pattern.behavior.state;

/**
 * @author lemon
 */
public class ConcreteStateA extends State {
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}
