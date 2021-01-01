package sybexreview.exams.one;

public class Tricky {
    public static void main(String[] args) {
        int x = 10 %2;
        int y = 3/5 + ++x;

        // won't compile because z hasn't been initialized
        //int z += 4 * x;
        //int z = z + 4*x;

        int z =0;
        z += 4 * x;

        System.out.println(String.format("x=%d, y=%d, z=%d",x,y,z));

        for(int i=1; i<1; i++) {
            System.out.println("in the for loop");
        }
    }
}
