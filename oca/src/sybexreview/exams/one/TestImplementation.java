package sybexreview.exams.one;

import javafx.scene.Parent;

public class TestImplementation extends ParentClass implements TestInterface  {
    @Override
    public void myAbsMethod() {
        System.out.println("Overriding myAbsMethod in TestImplementation");
    }

    @Override
    public void defaultAccessAbsMethod() {

    }

    protected void purr() {
        System.out.println("Purring in the child class");
    }

    public static void main(String[] args) {
        TestInterface fromtInterface = new TestImplementation();
        fromtInterface.someDefaultMethod();
        // Same as static method in class; won't compile on object
        //fromtInterface.someStaticMethod();
        TestInterface.someStaticMethod();
        new TestImplementation().purr();
    }
}

class ParentClass {
    protected void purr() {
        System.out.println("Purring in the parent class");
    }
}