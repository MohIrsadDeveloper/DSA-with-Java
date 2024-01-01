package com.Binary;

public class BinarySearchWithFloor {
    public static void main(String[] args) {
        int array[] = Input.inputArray();
        int target = Input.target();
        int output = binarySearchWithFloor(array, target);
        System.out.println(output);
    }

    public static int binarySearchWithFloor(int arr[], int target) {
        int low = 0, high = arr.length - 1;
        int res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {
                res = arr[mid];
                low = mid + 1;
            } else if (arr[mid] > target)
                high = mid - 1;
        }
        return res;
    }
}
