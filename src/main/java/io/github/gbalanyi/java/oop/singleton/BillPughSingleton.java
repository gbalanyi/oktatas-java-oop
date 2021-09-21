package io.github.gbalanyi.java.oop.singleton;

public final class BillPughSingleton {

    private static class InstanceHolder {
        protected static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    private BillPughSingleton() {
        System.out.println("BillPughSingleton created.");
    }

    public static BillPughSingleton getInstance() {
        return InstanceHolder.INSTANCE;
    }

    public void doSomething() {
        // Do something
    }
}
