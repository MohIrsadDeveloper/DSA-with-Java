package com.OOPs.Interface;


/*************** Without interface ****************/
//abstract class Computer {
//    public abstract void compileCode();
//}
//
//class Laptop extends Computer {
//    public void compileCode() {
//        System.out.println("You got 5 errors");
//    }
//}
//
//class Desktop extends Computer {
//    public void compileCode() {
//        System.out.println("You got 5 errors, fast");
//    }
//}


/*************** With interface ****************/

interface Computer {
    public void compileCode();
}

class Laptop implements Computer {
    public void compileCode() {
        System.out.println("You got 6 errors");
    }
}

class Desktop implements Computer {
    public void compileCode() {
        System.out.println("You got 6 error, fast");
    }
}

class Developer {
    public void buildApp(Computer obj) {
        System.out.println("Building App");
        obj.compileCode();
    }
}

public class Main {
    public static void main(String[] args) {
        /*************** Without interface ****************/
//        Laptop obj = new Laptop();
        Computer obj = new Desktop();

        Developer dev = new Developer();
        dev.buildApp(obj);

        /*************** With interface ****************/
        System.out.println("Interface with intermentation");
        Computer laptopInterface = new Laptop();
        Computer desktopInterface = new Desktop();

        Developer dev1 = new Developer();
        dev1.buildApp(laptopInterface);
        dev1.buildApp(desktopInterface);
    }
}
