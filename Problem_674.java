public class Problem_674 {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int maxSize = 1;
        int count = 1;

        for (int j=1; j<n; j++) {
            if (nums[j] > nums[j - 1]) count++;
            else {
                maxSize = Math.max(maxSize, count);
                count = 1;
            }
        }

        return Math.max(maxSize, count);
    }


//    public int findLengthOfLCIS(int[] nums) {
//        int ans = 1, startIndex = 0;
//
//        for (int i=1; i<nums.length; i++) {
//            if (nums[i-1] >= nums[i]) startIndex = i;
//            ans = Math.max(ans, i - startIndex + 1);
//        }
//
//        return ans;
//    }
}
