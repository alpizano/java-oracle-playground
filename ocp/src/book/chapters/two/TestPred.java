package book.chapters.two;

import java.util.function.Predicate;

public class TestPred {
    public static void testPred(Predicate<Integer> lambda) {
        System.out.println(lambda.test(2));
    }

    public static void main(String[] args) {
        //int x = 2;
        System.out.println("Hello");

        testPred( x -> x == 2);

        //System.out.println(() -> x == 2);
    }
}

