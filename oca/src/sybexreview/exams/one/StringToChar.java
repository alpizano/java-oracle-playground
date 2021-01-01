package sybexreview.exams.one;

public class StringToChar {
    public static void main(String[] args) {
        String letters = "abcde";
        // char cannot be converted to java.lang.String
        //String answer = letters.charAt(2);

        // Method 1
        String answer = Character.toString(letters.charAt(2));
        System.out.println(answer);

        // Method 2
        answer = String.valueOf(letters.charAt(2));
        System.out.println(answer);
    }
}
