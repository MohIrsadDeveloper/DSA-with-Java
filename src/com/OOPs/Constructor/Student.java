package com.OOPs.Constructor;

public class Student {
    // parameterize Constructor

    int id;
    String name;

    Student(int i, String n) {
        id = i;
        name = n;
    }

    void Display() {
        System.out.println("Student id is : " + id + " and name is " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Abdul");
        s1.Display();
    }
}
