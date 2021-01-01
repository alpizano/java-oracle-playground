package sybexreview.exams.one;

import java.util.ArrayList;
import java.util.List;

public class HowMany {
    static List<String> strArray = new ArrayList<>();

    public static int count(int a) {

        if(a !=3) {
            int b =1;
        }
        else {
            int b =2;
        }
        return a++;
    }

    public static void main(String[] args) {
        String myStr = "Hello World";
        String myIntStr = String.valueOf(1559);
        System.out.println(count(3));
        System.out.println(count(9));
        int[] intArray = {1,2,3,4,5};
        int[] newIntArray = new int[5];

        for(int i=0; i<intArray.length; i++) {
            newIntArray[i] = intArray[i];
        }
    }
}
