public class Problme_27 {
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 2, 3};
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};

        Solution_27 obj = new Solution_27();

        System.out.println(obj.removeElement(nums1, 3));
        System.out.println(obj.removeElement(nums, 2));
    }
}

class Solution_27 {
    public int removeElement(int[] nums, int val) {
        int i=0, j=nums.length-1;

        while(i<j) {
            if(nums[i] == val) {
                while (nums[j] == val) j--;
                nums[i] = nums[i] + nums[j];
                nums[j] = nums[i] - nums[j];
                nums[i] = nums[i] - nums[j];
            }
            i++;
        }

        return i;
    }
}
