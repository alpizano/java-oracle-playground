package chapters.one;

/**
 * Hello world!
 *
 */
public class Varargs
{
    public void test(String... var) {
        // ... denotes array type
        String[] ans = var;
        System.out.println(ans);
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
