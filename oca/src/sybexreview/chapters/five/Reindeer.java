package sybexreview.chapters.five;

public class Reindeer extends Deer {
    public Reindeer(int age) {
        System.out.println("Reindeer");
    }

    @Override
    public boolean hasHorns() {
        return true;
    }
}
