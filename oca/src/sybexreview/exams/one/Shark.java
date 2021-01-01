package sybexreview.exams.one;

public class Shark {
    static int numFins;
    static Water water;

    public static void main(String[] args) {
        // Compiles but throws null pointer exception
        water.toString();
        // Cant call methods on primitives
        // numFins.toString();
    }
}

class Water {
    @Override
    public String toString() {
        return "Water{}";
    }
}