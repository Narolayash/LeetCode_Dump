class Solution {
    public boolean linearSearch(int[] nums, int target) {
        for(int num: nums) {
            if (num == target) {
                return true;
            }
        }

        return false;
    }

    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;

        for (int i=0; i<n; i++) {
            if (!linearSearch(nums, k*(i+1))) return k*(i+1);
        }

        return k*(n+1);
    }
}