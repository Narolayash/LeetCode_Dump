public class Problem_2574 {
    public int[] leftRightDifference(int[] nums) {
        int leftSum = 0, rightSum = 0, n = nums.length;

        for (int num : nums) rightSum += num;
        for (int i=0; i<n; i++) {
            int val = nums[i];
            rightSum -= val;
            nums[i] = Math.abs(leftSum - rightSum);
            leftSum += val;
        }

        return nums;
    }

    // public int[] leftRightDifference(int[] nums) {
    //     int n = nums.length;

    //     int[] leftSum = new int[n];
    //     int[] rightSum = new int[n];

    //     int sum = 0;
    //     for (int i=0; i<n; i++) {
    //         leftSum[i] = sum;
    //         sum += nums[i];
    //     }

    //     sum = 0;
    //     for (int i=n-1; i>=0; i--) {
    //         rightSum[i] = sum;
    //         sum += nums[i];
    //     }

    //     int[] ans = new int[n];

    //     for (int i=0; i<n; i++) {
    //         ans[i] = leftSum[i] > rightSum[i] ? leftSum[i] - rightSum[i] : rightSum[i] - leftSum[i];
    //     }

    //     return ans;
    // }
}
