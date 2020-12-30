package sybexreview.exams.one;

public class TestDrive {
    int nonStaticVar = 0;

    // bypass static restrictions by passing instance of object as argument to method
    public static void go(Car c) {
        c.velocity +=10;
        // Non-static field 'nonStaticVar' cannot be referenced from static reference
        // nonStaticVar
    }
}

class Car {
    public int velocity = 10;
}