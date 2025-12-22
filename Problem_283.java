import java.util.Arrays;

public class Problem_283 {
    public static void main(String[] args) {
        int[] num = {1};

        Solution_283 obj = new Solution_283();
        obj.moveZeroes(num);

        System.out.println(Arrays.toString(num));
    }
}

class Solution_283 {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for(int num : nums) {
            if(num != 0) nums[i++] = num;
        }
        while(i<nums.length) nums[i++] = 0;
    }
}
