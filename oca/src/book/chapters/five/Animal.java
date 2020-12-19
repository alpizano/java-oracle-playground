package book.chapters.five;

public abstract class Animal {
    protected int age=33;

    public Animal(int age) {
        this.age=age;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public abstract String getName();
}
