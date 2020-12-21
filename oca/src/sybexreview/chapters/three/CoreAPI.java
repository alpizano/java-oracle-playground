package sybexreview.chapters.three;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class CoreAPI {
    // doesn't compile
    //String fishType = 5;
    public void test(int num, String s1, List<Integer> list) {
        s1.concat("!!!");
        list.add(1);
        list.add(2);
        list.add(3);
        num = num + 1;
    }

    public static void main(String[] args) {
        CoreAPI coreApi = new CoreAPI();
        int num = 5;
        List<Integer> list = new ArrayList<>();
        System.out.println("list before: " + list + ", num before: " + num);
        coreApi.test(num,"Hello", list);
        System.out.println("list after: " + list + ", num after: " + num);

        String a = "";
        a += 2;
        a += 'c';
        a += false;


        String strPool = "stringPool";
        // both are in string pool
        if(strPool == "stringPool") {
            System.out.println("it is in the string pool!");
        }
        // string "a" is a new string object as a result of cocat operations, so it is not in string pool
        if(a == "2cfalse") {
            System.out.println("it is in the string pool!");
        }

        Date[] dates[] = new Date[2][];
        String[] random2DArray[] = new String[5][4];
        System.out.println("length is: " + random2DArray.length);
        for (int i=0; i<5; i++) {
            for (int j=0; j<4; j++) {
                System.out.print(random2DArray[i][j] + " ");
            }
            System.out.println();
        }

        char[] c = new char[2];
        int random = c.length;

        int[] intList1 = new int[]{1,2,3};
        int[] intList2 = new int[]{1,2,3};

        List<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> arrayList2 = new ArrayList<>(Arrays.asList(1,2,3));

        System.out.println(intList1 == intList2);
        System.out.println(intList1.equals(intList2));
        System.out.println(Arrays.equals(intList1, intList2));

        System.out.println(arrayList1 == arrayList2);
        System.out.println(arrayList1.equals(arrayList2));

        // won't compile
        //arrayList1.add("hello");

        List<Integer> intList = Arrays.asList(10,4,-1,5);
        Collections.sort(intList);
        // Convert ArrayList<Integer> to Integer[]
        Integer[] array = intList.toArray(new Integer[4]);
        System.out.println(array[0]);

        String[] names = {"A", "B", "C"};
        // convert from String[] to ArrayList<String>
        List<String> strList = Arrays.asList(names);

        List<Integer> testList = new ArrayList<>();

        testList.add(null);
        Integer.parseInt("5");
        Integer.valueOf("6");

        LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
        date = date.plusDays(2);
        // date.plusHours(3);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());

        LocalDate date2 = LocalDate.of(2018, Month.APRIL, 30);
        System.out.println(date2.getYear() + " " + date2.getMonth() + " "
                + date2.getDayOfMonth());

        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.of(1, 2, 3);
        d = d.minus(p);
        // ofLocalizedDateTime
        // FULL = exception
        // LONG = exception
        // MEDIUM = Mar 7, 2014 11:22:33 AM
        // SHORT = 3/7/14 11:22 AM

        // ofLocalizedTime
        // LONG = exception
        // MEDIUM = 11:22:33 AM
        // SHORT = 11:22 AM
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        //DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        System.out.println(d.format(f));
    }
}
