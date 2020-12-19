package sybexreview.chapters.two;

public class Loops {
    public static void main(String[] args) {
        for(int i=0; i<10; ) {
            System.out.println("Hello world");
           //works
            i++;
            // increments, but assigns old value back to i, resulting in infinite loop
           // i = i++;
        }

        int x =1, p = 15;
        // need parenthesis but don't need  { }
        //while (x<10) System.out.println("NO");

        int y =1;
        do {
            //int y = 1;
            System.out.print(y++ + " ");
        } while(y <= 10);

        boolean keepGoing = true;

        int result = 15, i = 10;
        do{
            i--;
            if(i == 8) keepGoing = false;
            result-=2;
        } while(keepGoing);
        System.out.println();
        System.out.println("result: " + result);

        System.out.println(2 * 1 % 2 == 0);

    }
}
