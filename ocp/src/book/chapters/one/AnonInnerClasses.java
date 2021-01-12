package book.chapters.one;

//public class AnonInnerClasses implements AnonInnerClasses.InsideInterface {
public class AnonInnerClasses {
    // causes cyclical inheritance
//    @Override
//    public void printFromInside() {
//
//    }

    class MyInnerMemberClass {

    }

    public interface InsideInterface {
        public void printFromInside();
    }

    public void someMethod() {
        class MyLocalInnerClass {

        }

        // anonymous inner local class, extends class
        new ReallyDoSomething() {
            @Override
            public void nowYouNeedToReallyDoSomething() {

            }
        };

        // anonymous inner local class, implements interface
        new DoSomething() {

            @Override
            public void interDoSomething() {

            }
        };
    }

    static class MyStaticNestedClass {

    }
}

interface DoSomething {
    void interDoSomething();
}

abstract class ReallyDoSomething {
    public abstract void nowYouNeedToReallyDoSomething();
}