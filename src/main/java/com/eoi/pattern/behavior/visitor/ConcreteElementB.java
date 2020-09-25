package com.eoi.pattern.behavior.visitor;

/**
 * @author lemon
 */
public class ConcreteElementB implements Element {
    @Override
    public void aceept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB() {
        return "具体元素B的操作。";
    }
}
