package book.chapters.one;

public class NestedClassTest {
    private static int x = 5;

    static class Inner {
        // will mask variable if declared here or take the parent variable with same name
        //public static int x = 10;

        public static void go() {
            System.out.println(x);
        }
    }

    Inner inner = new Inner();

    public void doSomething() {
        inner.go();
    }

    public static void main(String[] args) {
        NestedClassTest nestedClassTest = new NestedClassTest();
        //Inner inner = nestedClassTest.new Inner();
        NestedClassTest.Inner.go();

        // can still instantiate it
        Inner inner = new Inner();

    }
}
