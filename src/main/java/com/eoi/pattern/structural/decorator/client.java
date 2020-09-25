package com.eoi.pattern.structural.decorator;

/**
 * @author lemon
 */
public class client {
    public static void main(String[] args) {
        System.out.println("---------------装饰前------------------");
        Component p = new ConcreteComponent();
        p.operation();
        System.out.println("---------------装饰后------------------");
        Component d= new ConcreteDecorator(p);
        d.operation();
    }
}
