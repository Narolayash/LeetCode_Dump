import java.util.Arrays;

public class Problme_27 {
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 2, 3};
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int[] nums2 = {1};

        Solution_27 obj = new Solution_27();

//        System.out.println(obj.removeElement(nums1, 3));
//        System.out.println(obj.removeElement(nums, 2));
        System.out.println(obj.removeElement(nums2, 1));
    }
}

class Solution_27 {
    public int removeElement(int[] nums, int val) {
        int i=0, j=nums.length;

        while(i<j) {
            if(nums[i] == val) {
                j--;
                while (nums[j] == val && i != j) j--;
                if (i!=j) {
                    nums[i] = nums[i] + nums[j];
                    nums[j] = nums[i] - nums[j];
                    nums[i] = nums[i] - nums[j];
                }
            }
            if(i == j) break;
            i++;
        }
        return i;
    }
}
