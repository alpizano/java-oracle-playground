package sybexreview.chapters.four;

import static sybexreview.chapters.four.Chimp.*;
import static sybexreview.chapters.four.Rope.LENGTH;
import static sybexreview.chapters.four.Rope.swing;

public class Chimp {
    public void nonStaticMethod() {
        return;
    }

    public static void staticMethod() {
        // can't call non-static from static methods
        //nonStaticMethod();
    }
    public static void main(String[] args) {
        Rope.swing();
        new Rope().swing();

        //swing();
        System.out.println(LENGTH);
    }
}

