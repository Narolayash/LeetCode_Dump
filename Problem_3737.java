public class Problem_3737 {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int subArrayCount = 0;

        for (int i = 0; i < n; i++) {
            int targetCount = 0;
            for (int j = i; j < n; j++) {
                // targetCount += nums[j] == target ? 1:0;
                // if ((j - i + 1) / 2 < targetCount) subArrayCount++;

                targetCount += (nums[j] == target) ? 1 : -1;
                if (targetCount > 0) subArrayCount++;
            }
        }

        return subArrayCount;
    }
}
