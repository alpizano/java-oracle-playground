package chapters.three;

public class StringMethods {
    public static void main(String[] args) {
        String test = "animals";
        String test2 = "fivefivro";
        System.out.println(test.indexOf("a"));
        System.out.println(test.indexOf("al"));
        System.out.println(test2.indexOf("fl"));

        int[]  a1 = {1,2,3,4};
        int[] a2 = {1,2,3};
        int[] a3 = a1;
        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));

        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = obj1;
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.equals(obj3));



    }
}
