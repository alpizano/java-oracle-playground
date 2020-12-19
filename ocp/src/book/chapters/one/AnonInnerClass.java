package book.chapters.one;

public class AnonInnerClass {
    public static void main(String[] args) {

        // Implementing Runnable is an anonymous class (local inner class with no name)
        Thread t1 =  new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Implenting runnable interface using anon. class");
            }
        });

        // This works the same with extending a class
        Thread t2 = new Thread() {
            public void run () {
                System.out.println("Extending Thead class using anon. class");

            }
        };

        t1.start();
        t2.start();


    }



}
