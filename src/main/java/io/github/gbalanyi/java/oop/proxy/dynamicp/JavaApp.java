package io.github.gbalanyi.java.oop.proxy.dynamicp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JavaApp {

    public static void main(String[] args) {
        new JavaApp();
    }

    public JavaApp() {

        CharSequence sequence1 = "ABC";
        this.processCharSequence(sequence1);

        CharSequence sequence2 = "Long text";
        this.processCharSequence(sequence2);

        this.createDynamicProxy(sequence2);
    }

    private void processCharSequence(CharSequence sequence) {
        if (sequence.length() > 3) {
            System.out.println(sequence.subSequence(0, 3));
        } else {
            System.out.println(sequence);
        }
    }

    private void createDynamicProxy(CharSequence sequence){
        CharSequence sequenceProxy = (CharSequence) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[]{CharSequence.class},
                new CharSequenceInvocationHandler(sequence));
        this.processCharSequence(sequenceProxy);
    }

    private static class CharSequenceInvocationHandler implements InvocationHandler {

        private CharSequence charSequence;

        public CharSequenceInvocationHandler(CharSequence charSequence){
            this.charSequence = charSequence;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object returnValue = method.invoke(charSequence, args);

            System.out.println(String.format("Call method on type. Type: %s, Method: %s",
                    charSequence.getClass().getSimpleName(),
                    method.getName()));

            if("length".equals(method.getName())){
                return getModifiedLength();
            }
            return returnValue;
        }

        private int getModifiedLength(){
            return charSequence.length() > 3 ? 3 : charSequence.length();
        }
    }
}
