import java.util.Arrays;
import java.util.Stack;

public class Problem_3974 {
    public long maxSum(int[] nums, int k, int mul) {
        int maxElement = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > maxElement) maxElement = num;
        }

        int[] counts = new int[maxElement + 1];

        for (int num : nums) {
            counts[num]++;
        }

        long totalSum = 0;
        for (int i=maxElement; i>=1; i--) {
            while (counts[i] > 0 && k > 0) {
                if (mul > 1) totalSum += (long) i * mul--;
                else totalSum += i;

                counts[i]--;
                k--;
            }
        }

        return totalSum;
        Stack
    }



//    public long maxSum(int[] nums, int k, int mul) {
//        Arrays.sort(nums);
//
//        long totalSum = 0;
//        int i = nums.length - 1;
//        while (k > 0 && i >= 0) {
//            if (mul > 1) totalSum += ((long) nums[i] * mul--);
//            else totalSum += nums[i];
//            i--;
//            k--;
//        }
//
//        return totalSum;
//    }
}

