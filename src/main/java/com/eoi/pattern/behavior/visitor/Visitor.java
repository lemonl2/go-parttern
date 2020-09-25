package com.eoi.pattern.behavior.visitor;

/**
 * @author lemon
 */
public interface Visitor {
    void visit(ConcreteElementA concreteElementA);
    void visit(ConcreteElementB concreteElementB);
}
