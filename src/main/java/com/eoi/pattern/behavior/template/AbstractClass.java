package com.eoi.pattern.behavior.template;

abstract class AbstractClass {
    public void TemplateMethod() {
        specificMethod();
        HookMethod1();
        if(HookMethod2()) {
            abstractMethod1();
        }
        abstractMethod2();
    }

    protected void specificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }

    abstract void abstractMethod1();
    abstract void abstractMethod2();

    public void HookMethod1(){}  //钩子方法1
    public boolean HookMethod2() //钩子方法2
    {
        return true;
    }
}
