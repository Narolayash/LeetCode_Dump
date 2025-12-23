package array_I;

import java.util.Arrays;

public class Concatenation_of_Array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        Solution_1 obj = new Solution_1();
        System.out.println(Arrays.toString(obj.getConcatenation(nums)));
    }
}

class Solution_1 {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];

        for(int i=0; i<nums.length; i++) {
            ans[i] = ans[nums.length + i] =  nums[i];
        }

        return ans;
    }
}
