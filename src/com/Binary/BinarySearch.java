package com.Binary;

public class BinarySearch {
    public static void main(String[] args) {
        int array[] = Input.inputArray();
        int target = Input.target();
        int output = binarySearch(array, target);
        System.out.println(output);
    }

    public static int binarySearch(int[] arr, int target) {
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
