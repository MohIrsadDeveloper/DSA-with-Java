import com.Binary.BinarySearch;
import com.Binary.BinarySearchWithRecursion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int arr[] = {1, 2, 3, 4, 5};
        int output = BinarySearch.binarySearch(arr, 5);
        System.out.println(output);
        int output2 = BinarySearchWithRecursion.binarySearchWithRecursion(arr, 0, 4, 3);
        System.out.println(output2);


    }
}