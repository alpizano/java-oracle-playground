package book.chapters.four;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Creating {
    public static void main(String[] args) {
        // FINITE STREAMS
        // creating
        Stream<Integer> empty = Stream.empty();
        empty.forEach(i -> System.out.print(i + " "));

        Stream<Integer> singleElement = Stream.of(1);
        singleElement.forEach(System.out::println);
        Stream<String> moreElements = Stream.of("A", "B", "C");
        moreElements.forEach(System.out::print);

        System.out.println();

        // creating from collections
        List<Integer> myIntList = Arrays.asList(1,2,3,4,5);
        myIntList.forEach(i -> System.out.print(i + " "));
        System.out.println();
        myIntList.stream().map(i -> i*i).forEach(i -> System.out.print(i + " "));
        System.out.println();
        // prints out-of-order (parallel processing)
        myIntList.parallelStream().forEach(i -> System.out.print(i + " "));

        // INFINITE STREAMS
        Stream<Double> infiNums = Stream.generate(() -> Math.random());
        //infiNums.forEach(i -> System.out.println(i));
        System.out.println();
        Stream<Integer> infiIt = Stream.iterate(33, i->i + 1);
        //infiIt.forEach(System.out::println);
    }
}
