class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;

        int sum = nums[0];
        if (n == 1) return sum + 1;

        for (int i=1; i<n && nums[i] == nums[i-1]+1; i++) {
            sum += nums[i];
        }

        while (true) {
            boolean found = false;

            for (int num : nums) {
                if (num == sum) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return sum;
            }

            sum++;
        }
    }
}