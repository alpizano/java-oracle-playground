package sybexreview.chapters.four;

public abstract class AbstractTest {
    public final void doSomething() {
        System.out.println("do something");
    }

   public abstract void doSomethingAbs();

public static void main(String[]args){

        }
}

abstract class ChildAbsClass extends AbstractTest {

}

class ChildClass extends ChildAbsClass {
    @Override
    public void doSomethingAbs() {

    }
}
