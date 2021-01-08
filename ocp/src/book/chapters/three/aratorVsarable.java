package book.chapters.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class aratorVsarable {

    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();
        Duck quack = new Duck("Quack");
        Duck puddles = new Duck("Puddles");
        ducks.add(quack);
        ducks.add(puddles);
        // duck.compareTo doesn't exist. Collections.sort() calls .compareTo
        Collections.sort(ducks);
        System.out.println(ducks);

    }
}

class Duck  implements Comparable<Duck>{
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Duck o) {
        return name.compareTo(o.name);
    }
}