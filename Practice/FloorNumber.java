package Practice;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;

        int index = Flooring(arr, target);

        if(index == -1)
            System.out.println("Floor not found");
        else
            System.out.println("Floor = " + arr[index]);
    }

    static int Flooring(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        if (target < arr[left]) return -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target > arr[mid]) left = mid + 1;
            else if (target < arr[mid]) right = mid - 1;
            else return mid;
        }

        return right;
    }
}
