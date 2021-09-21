package io.github.gbalanyi.java.oop.singleton;

public final class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("LazySingleton created.");
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }

        return instance;
    }

    public void doSomething() {
        // Do something
    }
}
