package com.OOPs.Constructor;

public class Student_Overloading {
    // Constructor overloading

    int id, age;
    String name;

    Student_Overloading(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    Student_Overloading(int i, String n) {
        id = i;
        name = n;
    }

    void Display() {
        System.out.println("id : " + id + " and name is " + name + " and age is " + age);
    }


    public static void main(String[] args) {
        Student_Overloading s1 = new Student_Overloading(1, "Abdul", 17);
        Student_Overloading s2 = new Student_Overloading(2, "Irshad");

        s1.Display();
        s2.Display();
    }
}
