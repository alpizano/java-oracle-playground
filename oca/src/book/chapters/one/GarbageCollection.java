package chapters.one;

public class GarbageCollection {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        // obj1 points to what obj2 points to; Object created by obj1 can be cleaned up
        obj1 = obj2;
        System.gc();
    }

}
