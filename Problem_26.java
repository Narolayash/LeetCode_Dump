public class Problem_28 {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        Solution_26 obj = new Solution_28();

        System.out.println(obj.removeDuplicates(nums));
        System.out.println(obj.removeDuplicates(nums1));
    }
}

class Solution_26 {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;

        while (j < nums.length) {
            if(nums[i] == nums[j]) j++;
            else nums[++i] = nums[j++];
        }

        return i+1;
    }
}
