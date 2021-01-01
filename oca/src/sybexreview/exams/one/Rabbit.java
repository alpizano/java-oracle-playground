package sybexreview.exams.one;

import java.time.*;

public class Rabbit implements CanHop {
    @Override
    // wont compile because default (package private access), attempting to assign less access t
    // int getLegLength() {
    public int getLegLength() {
        return 0;
    }

    @Override
    public void hop() {
        System.out.println("Hop");
    }

    public static void main(String[] args) {
        new Rabbit().hop();
        LocalDate localDate = LocalDate.of(2020, 7, 3);
    }
}

interface HasHindLegs {
    int getLegLength();
}

interface CanHop extends HasHindLegs {
    public void hop();
}