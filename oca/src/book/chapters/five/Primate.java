package chapters.five;

public class Primate {
    String species;

    public Primate(String species) {
        this.species=species;
    }

    protected void goToStore() {
        System.out.println("I am going to the store");
    }

    private void privateMethod() {
        System.out.println("Primate: Private Method");
    }

    public static void staticMethod() {
        System.out.println("Primate: Static Method");
    }
}
