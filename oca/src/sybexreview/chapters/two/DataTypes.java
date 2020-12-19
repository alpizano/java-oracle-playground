package sybexreview.chapters.two;

public class DataTypes {
    public static void main(String[] args) {
        // won't work
        //int x1 =50,int x2 =75;

        byte a=40, b =50;
        // need parenthesis around (a + b) or compiler error for loss of precision
        byte sum = (byte) (a + b);
        System.out.println(sum);
    }
}
