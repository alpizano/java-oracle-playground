package book.chapters.four;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateStreamOperations {
    public static void main(String[] args) {
        Properties props = new Properties();
        String result = props.getProperty("name");
        System.out.println(result);

        Stream<Integer> intStream = Stream.of(1,1,2,3,4,5,5,5,6,7,8,10,10);
        intStream.distinct().forEach(System.out::println);

        System.out.println();
        Stream<String> strStream = Stream.of("1","1","2","3","4","5","5","5","6","7","8","10","10");
        strStream.distinct().map(a -> a.length()).forEach(System.out::println);

        List<String> namesList = new ArrayList<>(Arrays.asList("Toby", "Anna", "Leroy", "Alex"));

        List<String> filteredNamesList = namesList.stream()
                .filter(i -> i.length() == 4)
                .limit(2)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(filteredNamesList);

        Stream<Integer> convStream = Stream.of(1,2,3,4,5);
        System.out.println();
        Stream<Integer> newStream = IntStream.rangeClosed(0,10).mapToObj(i -> i);
        newStream.forEach(System.out::print);
        // counts elements in stream
        //newStream.count();

        int streamSum = IntStream.rangeClosed(0,10).sum();
        System.out.println(streamSum);

        Stream<Integer> anotherIntStream = Stream.of(2,1,5,7,9,12);
        IntSummaryStatistics intSummaryStatistics = anotherIntStream.mapToInt(i -> i).summaryStatistics();
        System.out.println(intSummaryStatistics);

        Optional<Integer> optInt = Optional.of(3);
        //optInt.map
        // String.length()

        Stream<String> wordsStream = Stream.of("Hello", "World", "Hello", "Now", "Bears", "Suck", "Bears");
        Map<String, Integer> wordsMap = wordsStream.collect(Collectors.toMap(i -> i, i -> 1));
        System.out.println(wordsMap);
        Stream<Map<String,Integer>> wordsMapStream = Stream.of(wordsMap);


    }
}
