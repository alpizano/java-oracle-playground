package sybexreview.chapters.five;

public class Primate {

    public Primate() {

    }

    public Primate(int age) {

    }

    public static void main(String[] args) {
        Primate ape = new Primate();
    }
}

class Ape extends Primate {
    public Ape(int age) {
        // valid
       // super(age);

    }

}
