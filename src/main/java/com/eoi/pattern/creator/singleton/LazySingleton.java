package com.eoi.pattern.creator.singleton;

/**
 * 单例模式的主要角色如下。
 * 单例类：包含一个实例且能自行创建这个实例的类。
 * 访问类：使用单例的类。
 *
 * @author lemon
 */
public class LazySingleton {
    private static volatile LazySingleton instance = null;

    private LazySingleton() {}

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
