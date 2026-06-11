public class Problem_704 {
    public int search(int[] nums, int target) {
        return bsRecurtion(nums, target, 0, nums.length - 1);
    }

    public int bsRecurtion(int[] nums, int target, int start, int end) {
        if (start > end) return -1;

        int mid = start + (end - start) / 2;

        if (nums[mid] == target) return mid;

        if (nums[mid] > target) return bsRecurtion(nums, target, start, mid - 1);

        return bsRecurtion(nums, target, mid + 1, end);
    }

    // public int search(int[] nums, int target) {
    //     int start = 0, end = nums.length - 1;

    //     while (start <= end) {
    //         int mid = (end - start) / 2 + start;

    //         if (nums[mid] == target) return mid;

    //         if (nums[mid] > target)
    //             end = mid - 1;
    //         else
    //             start = mid + 1;
    //     }

    //     return -1;
    // }
}
