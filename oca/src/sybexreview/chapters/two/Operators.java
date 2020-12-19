package sybexreview.chapters.two;

public class Operators {
    public static void main(String[] args) {
        // <= relation operator
        // ! logical negation
        // -- unary arithmetic operator
        // == equality operator
        // + binary arithmetic operator

        // 5 or 10 are "integer literals" in java. They will be narrowed or widened if java deems fit.
        byte x = 5;
        byte y = 10;
        double z = x + y;
        int p = (int) z;

        System.out.println(z);
        System.out.println(p);

        // can't make boolean to string
        //String message = false;

        // XOR
        boolean something = true ^ false;
        System.out.println(something);

        // * and % same precedence

    }
}
