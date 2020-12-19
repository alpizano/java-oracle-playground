package book.chapters.four;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>(); //list of animals

        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        print(animals, x -> x.isCanHop());


    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for(Animal animal : animals) {
            if(checker.test(animal)) {
                System.out.println(animal + " ");

            }
        }
        System.out.println();
    }
}
