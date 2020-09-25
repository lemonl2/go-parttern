package com.eoi.pattern.creator.singleton;

/**
 * @author lemon
 */
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance() {
        return instance;
    }
}
