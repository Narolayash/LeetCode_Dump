package array;

public class Max_Consecutive_Ones {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};

        Solution_3 obj = new Solution_3();
        System.out.println(obj.findMaxConsecutiveOnes(nums));
    }
}

class Solution_3 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;

        for(int i=0; i<nums.length; i++) {
            if (nums[i] == 1) count++;
            else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return Math.max(max, count);
    }
}
