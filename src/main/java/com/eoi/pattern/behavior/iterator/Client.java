package com.eoi.pattern.behavior.iterator;

/**迭代器模式主要包含以下角色。
 抽象聚合（Aggregate）角色：定义存储、添加、删除聚合对象以及创建迭代器对象的接口。
 具体聚合（ConcreteAggregate）角色：实现抽象聚合类，返回一个具体迭代器的实例。
 抽象迭代器（Iterator）角色：定义访问和遍历聚合元素的接口，通常包含 hasNext()、first()、next() 等方法。
 具体迭代器（Concretelterator）角色：实现抽象迭代器接口中所定义的方法，完成对聚合对象的遍历，记录遍历的当前位置。
 * @author lemon
 */
public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("中山大学");
        aggregate.add("华南理工");
        aggregate.add("韶关学院");
        System.out.print("聚合的内容有：");
        Iterator iterator = aggregate.getIterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString()+"\t");
        }
        System.out.println("\nFirst："+iterator.first().toString());
    }
}
