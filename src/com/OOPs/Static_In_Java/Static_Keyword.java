package com.OOPs.Static_In_Java;

public class Static_Keyword {
    // static keyword
    static String name;
    static int age;

    static {
        System.out.println("Static block invoked");
        name = "Abdul";
        age = 17;
    }

    void Display() {
        System.out.println("Name : " + name + " age : " + age);
    }

    public static void main(String[] args) {
        System.out.println("This is from main method");
    }
}
