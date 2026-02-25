import java.util.Arrays;

public class Problem_1480 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[] {1,2,3,4})));
    }

    public static int[] runningSum(int[] nums) {
        int sum = 0;

        int i = 0;
        for (int value : nums)
            nums[i++] = sum += value;

        return nums;
    }
}
