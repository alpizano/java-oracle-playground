package sybexreview.exams.two;

class Toy {
    private boolean containsIce = false;

    public boolean containsIce() {
        return containsIce;
    }

    public void removeIce() {
        containsIce = true;
    }
}

public class Otter {
    private static void play() {
        Toy toy = new Toy();
        toy.removeIce();
    }

    private static void play(Toy toy) {
        toy.removeIce();
    }


    public static void main(String[] args) {
        Toy toy = new Toy();
        Otter.play();
        Otter.play(toy);
        System.out.println(toy.containsIce());

        // doesn't compile
//        int one ,two =0;
//        System.out.println(one);
    }

}
