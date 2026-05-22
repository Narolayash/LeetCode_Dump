package Practice;

public class RotatedArrayDupBS {


    public static int pivotIndex(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1])
                return mid;
            if (mid > start && nums[mid] < nums[mid - 1])
                return mid - 1;

            if (nums[start] == nums[mid] && nums[end] == nums[mid]) {
                if (nums[start] > nums[start + 1]) return start;
                start++;

                if (nums[end - 1] > nums[end]) return end - 1;
                end--;
            }
            else if (nums[start] < nums[mid] || nums[start] == nums[mid] && nums[mid] > nums[end]) start = mid + 1;
            else end = mid - 1;
        }

        return -1;
    }

    public static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) return mid;
            if (nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }

        return -1;
    }

    public static int search(int[] nums, int target) {
        int maxIndex = pivotIndex(nums);
        if (maxIndex == -1)
            return binarySearch(nums, target, 0, nums.length - 1);

        if (nums[maxIndex] == target)
            return maxIndex;

        if (target >= nums[0])
            return binarySearch(nums, target, 0, maxIndex - 1);

        return binarySearch(nums, target, maxIndex + 1, nums.length - 1 );
    }
}
