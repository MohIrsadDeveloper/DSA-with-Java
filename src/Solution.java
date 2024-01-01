public class Solution {
    public int linearSearch(int[] A, int B) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == B) {
                return 1;
            }
        }
        return -1;
    }

    public static int solve(int[] A) {
        int min = A[0];
        int max = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max)
                max = A[i];
            if (A[i] < min)
                min = A[i];
        }
        System.out.println(max + " : " + min);
        max = Math.abs(max);
        min = Math.abs(min);
        return max - min;
    }

    public static String solve1(String A) {
        String res = "";
        String[] arr = A.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            res += arr[i] + " ";
        }
        return res.trim();
    }

    public static String solve2(String A, int B) {
        char[] arr = A.toCharArray();
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + B]) {
                continue;
            } else {
                res += arr[i];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int A[] = {704, -964, -290, 297, -573, -347, 614, -396, 208, -613, -826, 759, 837, 224, -668, 717, -985, 778, -339, -253, 574, -378, -680, 949, -842, -547, -311, 846, 467, 435, 511, -596, -482, -757, 623, -1000, -225, -61, -251, -16, -851, 533, -784, 795, -796, -955, -762, -873, 575, -485, -538, -534, -367, -712, 941, 247, -265, 407, -126, 107, 605, -685, -522, -29, -246, 901, 661, 535, -69, 478, -169, 803, 857, -97, -187, -241, -286};
//        int output = linearSearch(A, 33);
//        int output = solve(A);
//        String output = solve1("the sky is blue");
        String output = solve2("aabbccd", 2);
        System.out.println(output);
    }
}