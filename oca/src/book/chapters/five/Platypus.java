package book.chapters.five;

class Mammal {
    public Mammal(int age) {
        System.out.println("Mammal");
    }
}

// Need to use super() for Mammal
public class Platypus extends Mammal {
    public Platypus () {
        super(5);
        System.out.println("Platypus");
    }

    public static void main(String[] args) {
        new Mammal(5);
    }
}
