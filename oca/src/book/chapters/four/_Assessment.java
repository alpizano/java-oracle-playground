package chapters.four;

public class _Assessment {
    int age = 0;
    private static Animal animal = new Animal("monkey",true,true);

    {
        System.out.println("Pus");
    }

    public _Assessment(int age) {
        this.age=age;
    }
    public void methodC() {
        System.out.println("Sup");
    }
    public static void methodD (){
        // can't access not-static field from static context
        //age = 4;

        // can't access not-static method from static context
        //methodC();
    }



    public static void main(String[] args) {
        _Assessment obj = new _Assessment(45);

        _Assessment assess = new _Assessment(15);
        _Assessment assess2 = null;

        assess.methodC();
        //assess2.methodC();

        // #1. B. final, C. private

        // #2. A. , D

        // #3. A, C., D.,

        // #4. A., B.,  G.

        // #5. D., G,

        // ******************* #6.  D.,

        // ******************* #7. B., C., D. Line 7, F. Line 9

        // #8. B., C., E.

        // #9. C., E.,

        // #10. B. swing swing 10

        // ********************** #11. B., E.

        // #12. D. 8

        // #13. E. 4

        // #14. B.

        // *********************** #15.  E. intObjectObject

        // #16. B. 9

        // *********************** #17. B., D., E.
        StringBuilder sb = new StringBuilder("a");
        System.out.println(sb);

        // #18. A, G.

        // #19. A., D.,

        // #20. E. this(2) on line 1

        // #21. C.,

        // ********************** #22. E. u u ucrcr

        // ********************** #23. A tacb

        // #24. B. value2, C. value3, E. value2,

        // *********************** #25. A, E

        // #26. A. match

        // #27. C. compiler error

        // #28. A. , D., F.

        // #29. A., F.
    }
}
