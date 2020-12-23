package sybexreview.chapters.four;

public class Overloading {
    Double doubleNum = 14.55;
    static Double staticDoubleNum = 15.99;

    public void nonStaticMethod() {
        this.doubleNum = 5.0;
    }

    public static void staticMethod() {
       // this.doubleNum = 5.0;
        staticDoubleNum = 14.00;
    }

    public static void main(String[] args) {
    }
}
