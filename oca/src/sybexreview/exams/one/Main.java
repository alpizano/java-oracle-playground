package sybexreview.exams.one;

public class Main {

    public static void main(String[] args) {
        int x = 5;

        while (x >= 0) {
            int y = 3;

            while (y > 0) {
                if (x < 2) {
                    break;
                }
                x--;
                y--;
                System.out.println(x * y + " ");
            }
        }
    }
}
