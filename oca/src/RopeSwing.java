import rope.Rope;
//import static rope.Rope.*;

public class RopeSwing {

    private static Rope rope1 = new Rope();
    private static Rope rope2 = new Rope();

    {
        // Should be called with Classname since static var
        // Need to import static or can't access var
        System.out.println(rope1.length);
        System.out.println(Rope.length);
    }

    public static void main(String[] args) {
        rope1.length = 2;
        rope2.length = 8;
        System.out.println(rope1.length);
    }

}
