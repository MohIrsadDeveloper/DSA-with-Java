package com.OOPs.Static_In_Java;

public class Students {
    String name;
    int age;
    static String college = "Hira";

    Students() {
        name = "Abdul";
        age = 17;
    }

    Students(String n, int a) {
        name = n;
        age = a;
    }

    static void Change() {
        college = "Al Jamiatul Hira";
    }

    void Display() {
        System.out.println("Name : " + name + " age : " + age + " college : " + college);
    }

    public static void main(String[] args) {
        Students s1 = new Students();
        s1.Display();

        Students s2 = new Students("Asma", 18);
        s2.Display();

        Students.Change();
        Students s3 = new Students("Afzal", 30);
        s3.Display();
    }
}
