public class Problem_167 {
    public int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) return mid;

            if (target < nums[mid]) end = mid - 1;
            else start = mid + 1;
        }

        return -1;
    }

    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        for (int i=0; i<n-1; i++) {
            int res = binarySearch(numbers, target - numbers[i], i+1, n-1);

            if (res != -1) {
                return new int[] {i+1, res+1};
            }
        }

        return new int[2];
    }
}
