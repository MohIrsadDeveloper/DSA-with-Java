package com.ArrayList;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("size : " + list.size());

        // add at index
        list.add(1, 40);

        // set => replace existence with new value
        list.set(1, 11);

        // toString
        System.out.println("toString : " + list.toString());

        // get
        System.out.println("get : " + list.get(1));

        // indexOf
        System.out.println("indexOf : " + list.indexOf(30));

        // remove
        System.out.println("remove : " + list.remove(3));


        // clear
        list.clear();

        // size
        System.out.println("size : " + list.size());
    }
}
