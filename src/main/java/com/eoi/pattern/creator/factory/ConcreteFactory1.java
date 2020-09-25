package com.eoi.pattern.creator.factory;

/**
 * @author lemon
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new ConcreteProduct1();
    }

    @Override
    public Product2 newProduct2() {
        System.out.println("具体工厂1生成-->具体产品2...");
        return newProduct2();
    }
}
