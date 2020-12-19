package chapters.one;

public class InitializerBlocks {
    String name;
    int age;

    {
        System.out.println("Test non-static initializer block");
    }

    public InitializerBlocks() {
        System.out.println("in the constructor");

    }

    public static void main(String[] args) {
        System.out.println("In main method");
      InitializerBlocks obj = new InitializerBlocks();

        if(true) {
            {
                System.out.println("some random stuff here");
            }
        }
    }
}
