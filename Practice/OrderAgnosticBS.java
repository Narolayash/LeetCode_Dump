package Practice;

import java.util.Arrays;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr = {99, 85, 45, 32, 12, 0, -1, -28, -45};
        System.out.println(orderAgnosticBS(arr, 0));
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            if ((isAsc && target < arr[mid]) || (!isAsc && target > arr[mid])) end = mid - 1;
            else start = mid + 1;

//            if (isAsc) {
//                if (target < arr[mid]) end = mid - 1;
//                else start = mid + 1;
//            }
//            else {
//                if (target > arr[mid]) end = mid - 1;
//                else start = mid + 1;
//            }
        }

        return -1;
    }
}
