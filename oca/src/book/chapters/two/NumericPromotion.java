package chapters.two;

public class NumericPromotion {


    public static void main(String[] args) {
        short x = 14;
        float y = 13;
        double z = 30;
        double x2 = 39.21;
        float y2 = 2.1f;
        long L1 = 400L;

        System.out.println(y);
        System.out.println(x * y / z);

        int test = (int) x2;
        int test2 = (int)y2;
        int test3 = x;
        int test4 = (int)L1;
    }
}
