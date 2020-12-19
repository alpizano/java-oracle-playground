package chapters.two;

public class Excep1 {
    Excep2 excep2;

    public void print() {
        excep2 = new Excep2();

        System.out.println("In Exception1");
        try {
            excep2.print2();
        }
        catch (RuntimeException e) {
            System.out.println("Caught it");
        }
    }
}
