package com.eoi.pattern.behavior.template;

/**
 * @author lemon
 */
public class ConcreteClass extends AbstractClass {
    @Override
    void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    @Override
    void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }

    @Override
    public void HookMethod1()
    {
        System.out.println("钩子方法1被重写...");
    }

    @Override
    public boolean HookMethod2()
    {
        return false;
    }
}
