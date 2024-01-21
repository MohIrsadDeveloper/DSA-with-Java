package com.OOPs.Interface;


interface ABC {
    public void show();

    default public void config() {
        System.out.println("Config set successfully");
    }

    static public void abc() {
        System.out.println("This is from abc method");
    }

}

class XYZ implements ABC {
    public void show() {
        System.out.println("This is from show method and class XYZ");
    }
}

public class InterfaceWithFunctionalInterface {
    public static void main(String[] args) {
        ABC.abc();
        ABC obj = new XYZ();
        obj.show();
        obj.config();
    }
}
