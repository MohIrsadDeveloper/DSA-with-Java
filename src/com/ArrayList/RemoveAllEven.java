package com.ArrayList;

import java.util.ArrayList;

public class RemoveAllEven {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(8);

        System.out.println("Before removing from list : " + list);
        removeAllEven(list);
        System.out.println("After removing from list : " + list);
    }


    public static void removeAllEven(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0)
                list.remove(i);
        }
    }
}
