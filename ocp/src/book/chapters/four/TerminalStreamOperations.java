package book.chapters.four;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class TerminalStreamOperations {
    public static void main(String[] args) {
        List<Integer> myIntList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Stream<Integer> intStream = Stream.of(1,2,3,4,5,6);
        System.out.println(myIntList.size());

        int i = (int)myIntList.stream().count();
        System.out.println(i);
        System.out.println(intStream.count());

        //myIntList.stream().min()
    }
}
