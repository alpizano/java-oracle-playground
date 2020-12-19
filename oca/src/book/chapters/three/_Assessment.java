package chapters.three;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _Assessment {
    public static void main(String[] args) {
        String s = "Hello";
        String t = new String(s);
        System.out.println("Hello".equals(s)); // true
        System.out.println(t == s); // false
        System.out.println(t.equals(s)); // true
        System.out.println("Hello" == s); // true
        System.out.println("Hello" == t); // false

        // #1. G. The code does not compile (b/c line 5)
        int numFish =4;
        String fishType = "tuna";

        //String anotherFish = numFish + 1;

        // #2. A. one, C. three, D. four
        // one

        // #3. B. , C, E,

        // #4. B. abbaccca ; inserts at direct-index and shifts to right
        // abbaccca
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb);

        // #5. F. The code does not compile; can't compare String vs. StringBuilder

        // #6. B. roar roar!!!
        String mystr1 = "Hello";
        String mystr2 = "World";
        mystr1 = mystr1.concat(mystr2);

        System.out.println("#6" + mystr1);

        // #7. B. 6, D. d, E, exception thrown

        // #8. A. 12 , E. blank, D. 78
        // 12
        // 78
        String numbers = "012345678";
        System.out.println(numbers.substring(7));

        System.out.println(numbers.substring(1,1));


        // #9. C. 8
        // pUrR two
        // 6

        // ***************#10. F. equals

        // #11. E. Exception is thrown from line 8
        // 1 +

        // StringBuilder delete
        // *****************#12. A.
        // 01+89-

        // *****************#13 F. trick question, does not compile
        // rum4

        // #14. A, C

        // *************** #15. A, B, D
        int[][] scores = new int[5][];
        Object[][][] cubbies = new Object[3][0][5];
        // C. illegal String beans[] = new beans[6];
        java.util.Date[] dates[] = new java.util.Date[2][];
        // E. illegal, no size initializer. int[][] types = new int[];
       // F. illegal, no size on first dimension int[][] java = new int[][];

        //System.out.println(scores[1][0]);

        // #16. C. .length for arrays (no parenthesis; it is not a method)
        char[] c = new char[2];

        // #17. F

        // #18. A, C, D, E,

        // #19. B, C,
        int[] intArr = {1,2,3,4,5};
        int[] intArr2 = {1,2,3,4,5};
        int[] intArr3 = {1,2,};

        List<Integer> intList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> intList2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println("19" + intArr.equals(intArr2));
        System.out.println("19" + intList.equals(intList2));
        intList.add(3);
        System.out.println(intList);
        intArr2 = intArr;
        System.out.println("19" + intArr.equals(intArr2));
        List<Integer> intList3 = Arrays.asList(1,2,3,4,5);
        // UnsupportedOperationException intList3.add(5);

        // #20 D. does not compile because adding .add(7)to a List<String>

        // #21. C. 6

        // #22. D. undefined b/c performing binary search on an unsorted array

        // #23. A. -1
        List<Integer> list = Arrays.asList(10,4,-1,5);

        // #24. C. Compiler error line 7
        String [] names = {"Tom", "Dick", "Harry"};
        //List<String> list =

        // #25. *************D.
        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(hex);
        // "30" , "3A", "8" , "FF"
        int x = Collections.binarySearch(hex, "8");
        int y = Collections.binarySearch(hex, "3A");
        int z = Collections.binarySearch(hex, "4F");

        System.out.println(x + " " + y + " " + z);

        // *************#26. A,B D,
        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        ages.add(null);

        // Can't unbox null -> int, however, Integer type works
        for(Integer i : ages) {
            System.out.print(i + " ");
        }

        // #27. B. B
        List<String> one = new ArrayList<>();
        one.add("abc");

        List<String> two = new ArrayList<>();
        two.add("aec");

        System.out.println(one.equals(two));

        // #28. D, F.

        // #29. D. LocalDate does not have time element, so can't call date.plusHours(3);
        LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);

        date.plusDays(2);
       //date.plusHours(3);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());

        // #30. F. Runtime exception
        //LocalDate date2 = LocalDate.of(2018, Month.APRIL, 40);
       // date2.plusDays(2);
        //date2.plusYears(3);
        //System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());

        // #31. B. Dates are immutable. Prints out 2018 APRIL 30
        LocalDate date3 = LocalDate.of(2018, Month.APRIL, 30);
        date3.plusDays(2);
        date3.plusYears(3);

        System.out.println("#31 " + date3.getYear() + " " + date3.getMonth() + " " + date3.getDayOfMonth());

        // #32. E. only outputs time
        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);

        // period of 1 year, 2 months, 3 days == 2014 March 7 ==  (short) 3/7/14
        Period p = Period.of(1,2,3);
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println("#32 " + f.format(d));

        // #33. B. no method chaining on period
        LocalDateTime d2 = LocalDateTime.of(2015, 5, 10, 11, 22, 33);

        // static methhod, cannot be chained
        Period p2 = Period.ofDays(1).ofYears(2);
        d2 = d2.minus(p2);
        DateTimeFormatter f2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(f.format(d2));




    }
}
