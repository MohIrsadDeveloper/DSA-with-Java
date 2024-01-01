package com.Binary;

import java.util.Scanner;

public class Input {
    public static int[] inputArray() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please input array size");
        int n = scn.nextInt();
        int array[] = new int[n];
        System.out.println("Please input your array elements");
        for (int i = 0; i < n; i++) {
            array[i] = scn.nextInt();
        }
        return array;
    }

    public static int target() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter target element");
        int target = scn.nextInt();
        return target;
    }
}
