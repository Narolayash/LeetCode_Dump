class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int res = -1;

        if (n == k) {
            for (int num: nums) {
                res = Math.max(res, num);
            }

            return res;
        }

        int[] count = new int[51];

        for (int num: nums) {
            count[num]++;
        }

        if (k == 1) {
            for (int i=50; i>=0; i--) {
                if (count[i] == 1) return i;
            }

            return res;
        }

        if (count[nums[0]] == 1)
            res = Math.max(res, nums[0]);

        if (count[nums[n-1]] == 1)
            res = Math.max(res, nums[n-1]);

        return res;
    }
}