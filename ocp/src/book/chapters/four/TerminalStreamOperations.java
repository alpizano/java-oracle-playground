package book.chapters.four;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalStreamOperations {
    public static void main(String[] args) {
        List<Integer> myIntList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> myEventsList = new ArrayList<>(Arrays.asList(2,4,6,8,10));

        Stream<Integer> intStream = Stream.of(1,2,3,4,5,6);
        System.out.println(myIntList.size());


        // count()
        int count = (int)myIntList.stream().count();
        System.out.println(count);
        System.out.println(intStream.count());

        // min()/max()
        // orElseThrow retuns the value from Optional directly (Optional.get()) or throws the exception
        Integer min1 = myIntList.stream().max(Comparator.comparingInt(i -> i)).orElseThrow(NoSuchElementException::new);
        // Integer min1 = myIntList.stream().max( (i, j) -> i - j).orElseThrow(NoSuchElementException::new);
        System.out.println(min1);


        // findAny()/findFirst()
        myIntList.parallelStream().forEach(i -> System.out.print(i + " "));
        System.out.println();
        // Always returns 1
        myIntList.parallelStream().findFirst().ifPresent(i -> System.out.println(i));

        myIntList.parallelStream().findAny().ifPresent(i -> System.out.println(i));


        // allMatch()/anyMatch()/noneMatch()
        boolean anyMatchResult = myIntList.stream().anyMatch(i -> i == 2);
        System.out.println(anyMatchResult);
        boolean allMatchResult = myEventsList.stream().allMatch(i -> i % 2 == 0);
        System.out.println(allMatchResult);


        // forEach


        // reduce()
        Map<Integer,String> wordCounts = new HashMap<Integer,String>() {{
            put(1, "go");
        }};

        Stream<Integer> mulInts = Stream.of(1,3,5, 3);
        Integer redAns = mulInts.reduce(1, (a,b) -> a*b);
        System.out.println(redAns);


        // collect()
        Stream<Character> letters = Stream.of('C', 'B', 'A', 'D', 'E', 'F'); // Tree(Map) , Tree(Set) maintains sorting order
        TreeSet<Character> myNewTreeSetFromStream = letters.collect(() -> new TreeSet<Character>(), (a,b) -> a.add(b), (a,b) -> a.addAll(b));
        System.out.println(myNewTreeSetFromStream);


        Stream<Integer> anotherIntStream = Stream.of(1,2,3,4,5,6);
        List<Integer> anotherIntList = anotherIntStream.collect(Collectors.toList());
        System.out.println(anotherIntList);
    }
}
