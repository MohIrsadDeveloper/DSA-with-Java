package com.OOPs.Interface;


interface A {
    void show();
}

class B implements A {
    public void show() {
        System.out.println("This is from Class B");
    }
}

public class Demo {
    public static void main(String[] args) {
        B instanceB = new B();
        instanceB.show();

        A instanceA = new B();
        instanceA.show();

    }
}
