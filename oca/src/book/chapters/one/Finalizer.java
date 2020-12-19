package book.chapters.one;

public class Finalizer {
    int i1 = 1_234;
    //double d1 = 1_234_.0;
    //double d2 = 1_234._0;
    //double d3 = 1_234.0_;
    double d4 = 1_234.0;

    //int amount = 9L;
    int amount2 = 0b101;
    int amount3 = 0XE;
    double amount4 = 0xE;
    //double amount5 = 1_2_.0_0;
    int amount6 = 1_2;




    protected void finalize() {
        System.out.println("Hello world");
    }

    public static void main(String[] args) {
        Finalizer f = new Finalizer();
    }
}
