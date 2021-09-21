package io.github.gbalanyi.java.oop.singleton;

public final class EagerSingleton {

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton(){
        System.out.println("EagerSingleton created.");
    }

    public static EagerSingleton getInstance(){
        return INSTANCE;
    }

    public void doSomething(){
        // Do something
    }
}
