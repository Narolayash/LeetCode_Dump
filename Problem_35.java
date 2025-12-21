public class Problem_35 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};

        Solution_35 obj = new Solution_35();

        System.out.println(obj.searchInsert(nums, 5));
        System.out.println(obj.searchInsert(nums, 2));
        System.out.println(obj.searchInsert(nums, 7));
    }
}

class Solution_35 {
    public int searchInsert(int[] nums, int target) {
        int i=0, j=nums.length-1;

        while(i <= j) {
            int mid = (i+j) / 2;

            if(nums[mid] == target) return mid;
            else if (nums[mid] > target) j = mid - 1;
            else i = mid + 1;
        }

        return i;
    }
}
