package sybexreview.exams.one;

import java.util.Arrays;

public class VarArgClass {
    public static void someArgs(int... args) {
        System.out.println(Arrays.toString(args));
    }

    public static void someArray(int[] args) {
        System.out.println(Arrays.toString(args));
    }

    public static void main(String[] args) {
        someArgs(1,2,3,4);
        // doesn't compile
        //someArgs(new int[]{1,2,3,4,5});
        someArray(new int[]{1,2,3,4,5});

        char value = 'c';
        System.out.println(value++);
        System.out.println(value);
        System.out.println(3/5);
    }
}
