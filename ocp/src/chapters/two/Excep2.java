package chapters.two;

public class Excep2 {
    Excep3 excep3;

    public void print2() {
        excep3 = new Excep3();

        System.out.println("In Exception2");
        excep3.print3();
    }
}
