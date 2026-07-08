package TUF_Recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursionOnSubsequences {

    // Time complexity O(2^n * n)
    // Space Complexity O(n)
    public static void subsequnce (int[] arr, int i, List<Integer> list) {
        int n = arr.length;

        if (i >= n) {
            System.out.println(list.toString());
            return;
        }

        list.add(arr[i]);
        subsequnce(arr, i+1, list);
        list.removeLast();
        subsequnce(arr, i+1, list);
    }

// reverse
//    public static void subsequnce (int[] arr, int i, List<Integer> list) {
//        int n = arr.length;
//
//        if (i >= n) {
//            System.out.println(list.toString());
//            return;
//        }
//
//        subsequnce(arr, i+1, list);
//        list.add(arr[i]);
//        subsequnce(arr, i+1, list);
//        list.removeLast();
//    }


    public static void main(String[] args) {
        subsequnce(new int[] {3, 1, 2}, 0, new ArrayList<Integer>());
    }
}
