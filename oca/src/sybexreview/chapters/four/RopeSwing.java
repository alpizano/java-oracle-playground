package sybexreview.chapters.four;

public class RopeSwing {
    private static final String leftRope;
    private static final String rightRope;
    // compiler error
    //private static final String bench;
    private static final String name = "name";

    static {
        leftRope = "left";
        rightRope = "right";
    }

    static {
        // compiler error
        //name = "name";
        //rightRope = "right";
    }

    public static void main(String[] args) {
        // compiler error
        // bench = "bench";
    }
}