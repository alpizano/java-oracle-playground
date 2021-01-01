package sybexreview.exams.one;


import java.util.ArrayList;
import java.util.List;

public class Frog {
    private List<Integer> legs;

    public Frog() {
        legs = new ArrayList<Integer>();
        for(int i=0; i<4; i++) {
            legs.add(i);
        }
    }
    public int Frog() {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new Frog().legs);
    }
}
