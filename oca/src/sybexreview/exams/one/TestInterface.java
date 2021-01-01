package sybexreview.exams.one;

// Interfaces can't extend Classes?
//public interface TestInterface extends Duck{
public interface TestInterface {
    // public static final are implied
    public static final String MY_CONST = "something";

    // public and abstract are implied
    public abstract void myAbsMethod();

    // default method
    default void someDefaultMethod() {
        System.out.println("Some default implementation here");
    }

    static void someStaticMethod() {
        System.out.println("Some static method implementation here");
    }

    void defaultAccessAbsMethod();
}

