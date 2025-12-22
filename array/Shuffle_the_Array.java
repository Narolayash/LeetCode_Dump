package array;

import java.util.Arrays;

public class Shuffle_the_Array {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};

        Solution_2 obj = new Solution_2();
        System.out.println(Arrays.toString(obj.shuffle(nums, 3)));
    }
}

class Solution_2 {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];

        int j = 0;
        for(int i=0; i < ans.length; i++) {
            if(i%2==0) ans[i] = nums[j++];
            else ans[i] = nums[n++];
        }

        return ans;
    }
}
