package book.chapters.five;

public class Swan extends Animal{

    public Swan(int age) {
        super(age);
    }
    @Override
    public String getName() {
        return "Swan";
    }

    public void test() {
        System.out.println(age);
    }

    public static void main(String[] args) {
        Swan swan = new Swan(55);
        // How is Animal Swan = new Swan(); any different?
        swan.test();
    }
}
