package com.binary;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please input array size");
        int n = scn.nextInt();
        int array[] = new int[n];
        System.out.println("Please input your array elements");
        for (int i = 0; i < n; i++) {
            array[i] = scn.nextInt();
        }
        System.out.println("Please enter target element");
        int target = scn.nextInt();
        int output = binarySearch(array, target);
        System.out.println("Target Element found at : " + output);
    }

    static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                high = mid - 1;
            else if (arr[mid] < target)
                low = mid + 1;
        }
        return -1;
    }
}
