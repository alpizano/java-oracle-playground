package book.chapters.four;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Supplier<LocalDateTime> mySupplierTime = () -> LocalDateTime.now();
        // regular consumer doesn't compile
        IntConsumer myConsumerSout = i -> System.out.print(i + " ");

        IntStream.range(0,5).forEach(i -> System.out.print(i + " "));
        System.out.println();
        IntStream.range(0,5).forEach(myConsumerSout);
        int var1 = 89;
        float var2 = var1;

        // 2. converts integral to floating
        // int var3 = var1 + var2; // won't compile
        System.out.println(var2);

        //IntStream.range(0,5).map(i -> i*i)

        Stream<Integer> itStream = Stream.iterate(1, n -> n + 1);
        //itStream.forEach(i -> System.out.println(i));

        Stream<Character> charStream = Stream.iterate('a', i ->  i++);
        //charStream.forEach(i -> System.out.println(i));

       // Stream.generate(() -> Math.random()).forEach(i -> System.out.println(i));


        Optional<Double> result = Stream.generate(() -> Math.random()).findFirst();
        System.out.println(result.get());

        Optional<Integer> opt = Optional.empty();

        List<Integer> myList  =  new ArrayList<>(Arrays.asList(1,2,3,4,5));


        boolean doTheyMatch = myList.stream().allMatch(i -> i<6);
        System.out.println(doTheyMatch);



    }
}
