public class LinearSearch {
    public static void main(String[] args) {
//        int[] nums = {10, 20, 45, 25, 14, 1, 48, 48, 85, 92};
        int[] nums = new int[0];
        System.out.println(linearSearch(nums, 25));
        System.out.println(linearSearch2(nums, 25));
        System.out.println(linearSearch3(nums, 25));

    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) return -1;

        for(int i=0; i<arr.length; i++) {
            if (arr[i] == target) return i;
        }

        return -1;
    }

    static int linearSearch2(int[] arr, int target) {
        for (int j : arr) {
            if (j == target) return j;
        }

        return Integer.MAX_VALUE;
    }

    static boolean linearSearch3(int[] arr, int target) {
        for (int j : arr) {
            if (j == target) return true;
        }

        return false;
    }
}
