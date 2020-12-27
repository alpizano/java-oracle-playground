package sybexreview.chapters.five;

public class Deer {
    public Deer() {
        System.out.print("Deer");
    }

    public Deer(int age) {
        System.out.print("DeerAge");
    }

    // hidden method; not an override
    private boolean hasHorns() {
        return false;
    }

    public static void main(String[] args) {
        Deer deer = new Reindeer(5);
        // hidden method called from Deer reference
        System.out.print("," + deer.hasHorns());
    }
}

class Reindeer extends Deer {
    public Reindeer(int age) {
        // java automatically inserts super() call to parent constructor if no explicit call to parent constructor is made
        super(age);
        System.out.print("Reindeer");
    }

    //@Override
    public boolean hasHorns() {
        return true;
    }
}

