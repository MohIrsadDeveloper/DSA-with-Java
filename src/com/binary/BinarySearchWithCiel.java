package com.binary;

public class BinarySearchWithCiel {
    public static void main(String[] args) {
        int array[] = Input.inputArray();
        int target = Input.target();
        int output = binarySearchWithCiel(array, target);
        System.out.println(output);
    }

    public static int binarySearchWithCiel(int arr[], int target) {
        int low = 0, high = arr.length - 1;
        int res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                res = arr[mid];
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            }
        }
        return res;
    }
}
