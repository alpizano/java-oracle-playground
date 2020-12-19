package book.chapters.four;

public class Reptile {
    int age;
    String name;

    public Reptile(int age) {
        //this.age=age;
    }

    public Reptile(int age, String name) {
        this(age);
        this.name=name;
    }

    public void test() {
        test();

    }
}
