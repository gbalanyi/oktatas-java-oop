package io.github.gbalanyi.java.oop.singleton;

public class JavaApp {

    private EagerSingleton eagerSingleton;

    public static void main(String[] args) {
        new JavaApp();
    }

    public JavaApp(){
        System.out.println("I will call the singletons.");
        EagerSingleton.getInstance().doSomething();
        LazySingleton.getInstance().doSomething();
        SynchronizedLazySingleton.getInstance().doSomething();
        BillPughSingleton.getInstance().doSomething();
    }
}
