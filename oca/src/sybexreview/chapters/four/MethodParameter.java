package sybexreview.chapters.four;

import java.lang.reflect.Method;

public class MethodParameter {
    public void doSomething(java.lang.Object something) {
        System.out.println("Hello world");
    }

    public static void main(String[] args) {
        Integer myNum = 55;
        int myInt = 59;
        MethodParameter mP = new MethodParameter();

        mP.doSomething(myNum);
        mP.doSomething(myInt);
    }
}
