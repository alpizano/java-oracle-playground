package chapters.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class MethodRefs {
    public static void main(String[] args) {
        List<Integer> myIntList = new ArrayList<>(Arrays.asList(77,42,11,55,44,31));

        //Collections.sort(myIntList);

        System.out.println(myIntList);
        Consumer<List<Integer>> sortLambda = i -> Collections.sort(i);
        sortLambda.accept(new ArrayList<>(Arrays.asList(77,42,11,55,44,31)));
        System.out.println(myIntList);


        myIntList.forEach(i -> System.out.println(i));
    }
}
