package sybexreview.exams.one;

public class BlackRhino extends Rhinoceros {
    private static int count;

    public BlackRhino() {
        this(5);
        System.out.println("3");
    }
    public BlackRhino(int age) {
        // explicit call to parent constructor, results in NEW, 2, 3 to stdout
        //super(age);
        System.out.println("2");
    }

        public static void main(String[] args) {
        count++;
        BlackRhino blackRhino = new BlackRhino();
            System.out.println(1 * -1);
    }
}

class Rhinoceros {
    public Rhinoceros() {
        System.out.println("1");
    }

    public Rhinoceros(int age) {
        System.out.println("NEW");
    }
}
