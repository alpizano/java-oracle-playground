package book.chapters.five;

public class Ape extends Primate{
    String species = "Ape";

    public Ape() {
        super("Primate");
    }

    public void printThis() {
        System.out.println(this.species);
    }

    public void printParent() {
        System.out.println(super.species);
    }

    @Override
    public void goToStore() {
        super.goToStore();
        System.out.println("I am NOT going to the store");
    }

    // Private methods aren't overriden ; they are treated as brand new methods
    private void privateMethod() {
        System.out.println("Ape: Private method");
    }

    public static void staticMethod() {
        System.out.println("Ape: Static Method");
    }

    public static void main(String[] args) {
        Ape ape = new Ape();
        System.out.println(ape.species);
        ape.printParent();
        ape.printThis();

        // Inherits protected method from super class/parent class
        ape.goToStore();
        ape.privateMethod();

        // If "hidden" static method not implemented in Ape, will call Primate's static method
        staticMethod();
    }
}
