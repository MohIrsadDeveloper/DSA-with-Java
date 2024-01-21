package com.OOPs.Interface;

class AA {
    public void show() {
        System.out.println("This is from show method");
    }

    class BB {
        public void display() {
            System.out.println("This is from display method of inner class");
        }
    }

    static class CC {
        public void render() {
            System.out.println("This is from render method of inner static class");
        }
    }
}

public class InnerClasss {
    public static void main(String[] args) {
        AA obj = new AA();
        obj.show();

        AA.BB obj2 = obj.new BB(); // use with using object of outer class
        obj2.display();

        AA.CC obj3 = new AA.CC(); // use with using class of outer class
        obj3.render();
    }
}
