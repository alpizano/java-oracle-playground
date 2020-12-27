package sybexreview.chapters.five;

public class Booger {
    int age;
    public Booger(int age) {
        //super()?
        super();
        this.age=age;
    }

    public static void main(String[] args) {
        Booger booger = new Booger(19);
        System.out.println(booger.age);
    }
}
