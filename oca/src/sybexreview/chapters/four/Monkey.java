package sybexreview.chapters.four;

public class Monkey implements Animal{
    public void printStuff() {
        System.out.println(NAME);
    }

    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.printStuff();
    }
}
