package intro;

import java.util.ArrayList;
import java.util.List;

/**
 * Assesment Test xxxi
 */
public class _Assessment {
    // identifiers may begin with LETTER, UNDERSCORE (_),  or DOLLAR-SIGN ($)
    private static int $;

    public static void main(String[] args) {

        // #1: E. Compiler error on line 6 (System.out.println(a_b))
        String a_b;

        System.out.println($);
        //System.out.println(a_b);

        // #2: C. true is printed out exactly three times
        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));

        // #3: C. The code will not compile because of line 3, D. , E.

        // #4: C. 6
        // 0 (1) -> x = 2
        // 1 (2) -> x = 1
        // 2 (3) -> x = 6

        // #D: F. abcde
        // a
        // b
        // Throws IllegalArgumentException

        System.out.print("a");
        try {
            System.out.print("b");
            // IllegalArgumentException is child of parent class RuntimeException so is caught
            throw new IllegalArgumentException();
        }
        catch(RuntimeException e) {
            System.out.print("c");
        }
        finally {
            System.out.print("d");
        }
        System.out.println("e");
        System.out.println();

        // #6: B. 15

        // #7: B. [9]]
        // 9

        // #8: A. DeerReindeer,false

        // #9: B, C. Only checked exceptions are required to be handled (caught) or declared

        // #10: C. Immediately after line 9, only one grasshopper object is eligible for garbage collection, D., F.



        // #11: B. 12
        int x = 5, j = 0;

        OUTER: for(int i=0; i<3;)

            INNER: do {
            i++;
            x++;

            if(x > 10)
                break INNER;
            x += 4;
            j++;
            }

            while( j <= 2);
        System.out.println(x);

        // x=6, i=1
        // x=10, j=1

        // x=7, i=2
        // x=11, j=2

        // x=8, i=3
        // x =

        // #12: B. Color:null

        // #13: C. BearShark

        // #14: B. The code will not compile because of lines 7-8
        List<String> strList = new ArrayList<>();
        //strList = null;

        // If Arraylist size == 0, get() throws IndexOutOfBoundsException
        strList.get(0);

        // If Arraylist == null, will throw NullPointerException for any method called on it
        System.out.println("Size is: " + strList.size());

        // #15: A. CanSwim, C. Amphibian, E. Object

        // #16: D. Remove the default method modifier and method implementation on lines 1 and 2,
               // F.
                // G. Override the getNmae() method with a concrete method in the Otter class

        // #17: A., C., F.

        // New data API uses static methods vs. constructors
        // #18: B, D

        // #19: C. .class

        // StackOverflow is a throwable and NOT an exception
        // #20
        // A, C,


    }
}
