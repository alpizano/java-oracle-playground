package book.chapters.one;


public class LocalInnerClassEx {
    private int x = 24;

    // inner class; has access to all variables
    class InnerClass {

        public void print() {
            System.out.println(x);
        }
    }


    public int getX() {
        String message = "x is " ;

        // local inner class
        class LocalInnerClass {
            private int x = LocalInnerClassEx.this.x;

            public void printX() {
                System.out.println(message + x);
            }
        }

        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.printX();
        return x;
    }

    public static void main(String[] args) {
        new LocalInnerClassEx().getX();
    }
}
