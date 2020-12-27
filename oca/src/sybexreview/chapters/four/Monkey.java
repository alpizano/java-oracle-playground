package sybexreview.chapters.four;

public class Monkey implements Animal{
    public void printStuff() {
        System.out.println(NAME);
        //System.out.println(word = "dfsfs");
        //System.out.println(Animal.age = 33);
    }

    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.printStuff();
    }
}
