package com.OOPs.Constructor;

public class Student_Copy {
    int id;
    String name;

    Student_Copy(int i, String n) {
        id = i;
        name = n;
    }

    Student_Copy(Student_Copy s) {
        id = s.id;
        name = s.name;
    }

    void Display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student_Copy s1 = new Student_Copy(1, "Abdul");
        Student_Copy s2 = new Student_Copy(s1);

        s1.Display();
        s2.Display();
    }
}
