public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,8,8,8,8,8,10};

        System.out.println(binarySearch(arr, 5));
    }

    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target > arr[mid]) left = mid + 1;
            else if (target < arr[mid]) right = mid - 1;
            else return mid;
        }

        return -1;
    }
}
