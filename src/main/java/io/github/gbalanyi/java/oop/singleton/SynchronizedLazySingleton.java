package io.github.gbalanyi.java.oop.singleton;

public final class SynchronizedLazySingleton {

    private static SynchronizedLazySingleton instance;

    private SynchronizedLazySingleton() {
        System.out.println("SynchronizedLazySingleton created.");
    }

    public static synchronized SynchronizedLazySingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedLazySingleton();
        }

        return instance;
    }

    public void doSomething() {
        // Do something
    }
}
