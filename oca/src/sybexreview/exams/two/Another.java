package sybexreview.exams.two;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Another {
    String msg;

    public static void main(String[] args) {
        new Another().msg = "45";

        StringBuilder s1 = new StringBuilder("Hello");
        // prints out string builder
        System.out.println(s1);
        s1.delete(0,5);
        System.out.println(s1);
        System.out.println(s1.toString());

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);
        list.add(null);

        // null pointer exception at runtime
        // can ONLY iterate first-to-last with enhanced-for loop
//        for(int i: list) {
//            System.out.println(i);
//        }

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John",33));
        studentList.add(new Student("Al",42));
        studentList.add(new Student("Rudy",34));
        studentList.remove(new Student("Al",42));

        System.out.println(studentList);
        //studentList.removeAll(studentList);
        //studentList.clear();

        // does not print with 'f'
        float num = 124.34f;
        System.out.println(num);
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name=name;
        this.age=age;
    }

    // needed for removing from arraylist
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

