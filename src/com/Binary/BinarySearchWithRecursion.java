package com.Binary;

public class BinarySearchWithRecursion {
    public static void main(String[] args) {
        int array[] = Input.inputArray();
        int target = Input.target();
        int output = binarySearchWithRecursion(array, 0, array.length - 1, target);
        System.out.println(output);

    }

    public static int binarySearchWithRecursion(int[] arr, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                return binarySearchWithRecursion(arr, low, mid - 1, target);
            else if (arr[mid] < target)
                return binarySearchWithRecursion(arr, mid + 1, high, target);
        }
        return -1;
    }
}
