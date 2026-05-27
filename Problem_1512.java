public class Problem_1512 {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101];
        int ans = 0;
        for (int num: nums) {
            ans += freq[num];
            freq[num]++;
        }

        return ans;
    }

    // public int numIdenticalPairs(int[] nums) {
    //     int gpairs = 0;

    //     for (int i=0; i<nums.length-1; i++) {
    //         for (int j=i+1; j<nums.length; j++) {
    //             if (nums[i] == nums[j]) gpairs++;
    //         }
    //     }

    //     return gpairs;
    // }
}
