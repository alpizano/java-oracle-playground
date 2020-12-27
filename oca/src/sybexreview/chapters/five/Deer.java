package sybexreview.chapters.five;

public class Deer {
    public Deer() {
        System.out.println("Deer");
    }

    public Deer(int age) {
        System.out.println("DeerAge");
    }

    // hidden method; not an override
    private boolean hasHorns() {
        return false;
    }
}
