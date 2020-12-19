package book.chapters.four;

import java.util.function.Predicate;

public class TestLambda {
    public String str = "";

    public boolean randomTest(String s1, Predicate<String> pred) {
       return pred.test(s1);
    }
    public static void main(String[] args) {
        TestLambda testLambda = new TestLambda();

        System.out.println(testLambda.randomTest("fdfsdfdfsd", s -> s.isEmpty()));
    }
}
