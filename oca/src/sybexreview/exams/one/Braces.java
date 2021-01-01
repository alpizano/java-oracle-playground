package sybexreview.exams.one;

public class Braces {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 8;

        // can remove  { } braces from for loop and if statement
        for(int i = 0; i<3; i++)
            if(num1 == num2)
                try {
                    System.out.println("t");
                }
                catch (Exception e) {
                    System.out.println("c");
                }


    }
}
