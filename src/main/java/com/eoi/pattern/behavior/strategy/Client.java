package com.eoi.pattern.behavior.strategy;

/**
 * @author lemon
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        Strategy s = new ConcreteStrategyA();
        context.setStrategy(s);
        context.strategyMethod();
        System.out.println("-----------------");
        s = new ConcreteStrategyB();
        context.setStrategy(s);
        context.strategyMethod();
    }
}
