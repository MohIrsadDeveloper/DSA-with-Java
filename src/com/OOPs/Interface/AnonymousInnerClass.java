package com.OOPs.Interface;

interface Car {
    void drive();
}

class Wagoner implements Car {
    public void drive() {
        System.out.println("Driving...");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Car wagoner = new Wagoner();
        wagoner.drive();

        // with anonymous function
        Car wagoner1 = new Wagoner();
        {
            System.out.println("This is from anonymous method with inner class");
        }
    }
}
