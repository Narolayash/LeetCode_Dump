import java.util.Arrays;

public class Problem_1929 {
    public int[] getConcatenation(int[] nums) {
        int[] res = Arrays.copyOf(nums, nums.length * 2);
        System.arraycopy(nums, 0, res, nums.length, nums.length);
        return res;
    }

    //     public int[] getConcatenation(int[] nums) {
//         int[] ans = new int[2 * nums.length];

//         for(int i=0; i<nums.length; i++) {
//             ans[i] = ans[nums.length + i] =  nums[i];
//         }

//         return ans;
//     }

//    public int[] getConcatenation(int[] nums) {
//         int[] ans = new int[nums.length * 2];

//         int i = 0;
//         for(int value : nums)
//             ans[i++] = ans[i + nums.length - 1] = value;

//         return ans;
//     }
}
