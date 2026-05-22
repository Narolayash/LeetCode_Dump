package Practice;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 35, 48};

        System.out.println(Ceiling(arr, 50));
    }

    static int Ceiling(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        if (target > arr[right]) return -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target > arr[mid]) left = mid + 1;
            else if (target < arr[mid]) right = mid - 1;
            else return mid;
        }

        return left;
    }
}


