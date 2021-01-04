package sybexreview.exams.two;

public class MySecret implements Secret {
    @Override
    public int test(int a, int b) {
        System.out.println(a+b);
        return a+b;
    }
}

interface Secret {
    int test(int a, int b);
}

class Caller {
    public void doSomething(int x, int y, Secret secret) {
        int value = secret.test(x, y);
        System.out.println(value);
    }

    public static void main(String[] args) {
            Caller caller = new Caller();

            caller.doSomething(7, 3, (a,b) -> a - b);
            new MySecret().test(7,3);
        }
    }
