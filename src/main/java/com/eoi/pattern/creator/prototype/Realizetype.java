package com.eoi.pattern.creator.prototype;

/**
 * 原型模式包含以下主要角色。
 * 抽象原型类：规定了具体原型对象必须实现的接口。
 * 具体原型类：实现抽象原型类的 clone() 方法，它是可被复制的对象。
 * 访问类：使用具体原型类中的 clone() 方法来复制新的对象。
 * @author lemon
 */
public class Realizetype implements Cloneable {
    Realizetype() {
        System.out.println("具体原型创建成功！");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype)super.clone();
    }
}
