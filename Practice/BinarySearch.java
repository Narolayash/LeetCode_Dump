public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};

        System.out.println(binarySearch(arr, 9));
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
