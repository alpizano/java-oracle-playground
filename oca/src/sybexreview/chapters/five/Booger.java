package sybexreview.chapters.five;

public class Booger {
    int age = 33;
    String name;


    public Booger(int age) {
        //super()?
        super();
        this.age=age;
        name = "Alberto";
    }

    public void doSomething() {
        int age = 15;
        name = "Johnny";
        System.out.println("age is: " + age);
    }

    public static void main(String[] args) {
        Booger booger = new Booger(19);
        System.out.println(booger.age);
        booger.doSomething();

        int element = 275;

        if(300 >= element && element >= 50) {
            System.out.println("yes");
        }
    }
}
