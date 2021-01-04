package sybexreview.exams.two;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello world");

        // returns "this" strinb builder object
        StringBuilder sb2 = sb1.append("c");

        String tiger = "Tiger";
        String lion = "Lion";
        final String statement = 250 > 338 ? lion : tiger = " is Bigger";
        System.out.println(statement);
    }
}
