package sybexreview.exams.two;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello world");

        // returns "this" strinb builder object
        StringBuilder sb2 = sb1.append("c");

        String tiger = "Tiger";
        String lion = "Lion";

        // doesn't compile, reduces to (250 > 338 ? lion : tiger) = " is Bigger"
       // final String statement = 250 > 338 ? lion : tiger = " is Bigger";

        // compiles with parenthesis
        final String statement = 250 > 338 ? lion : (tiger = " is Bigger");
        System.out.println(statement);

        int x =5 ;
        if( (x = 7) > 5) {
            System.out.println("Yeah its bigger man");
            System.out.println(String.format("x: %s", x));
        }

        List myList = new ArrayList();
        myList.add(false);
        myList.add(1);

        System.out.println(myList.contains(false));
        System.out.println(myList.contains(new Boolean(false)));
        System.out.println(myList.contains(1));
    }
}
