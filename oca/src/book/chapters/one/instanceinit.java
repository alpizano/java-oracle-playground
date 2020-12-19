package chapters.one;

import java.sql.SQLOutput;

public class instanceinit {
    int age;
    int number = 1_2;

    {
        System.out.println("Do some stuff");
        System.out.println(number);
    }

    public static void main(String[] args) {
        {
            System.out.println("Sup man");
        }

        instanceinit obj = new instanceinit();
    }
}
