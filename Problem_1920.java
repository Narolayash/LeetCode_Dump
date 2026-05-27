//import java.util.Arrays;
//
public class Problem_1920 {
    public int[] buildArray(int[] nums) {
        arrenge(nums, 0);

        return nums;
    }

    public void arrenge(int[] nums, int idx) {
        if (idx == nums.length) return;

        int newValue = nums[nums[idx]];

        arrenge(nums, idx + 1);

        nums[idx] = newValue;
    }

    // public int[] buildArray(int[] nums) {
    //     int[] ans = new int[nums.length];

    //     int i = 0;
    //     for (int num : nums) {
    //         ans[i++] = nums[num];
    //     }

    //     return ans;
    // }
}
