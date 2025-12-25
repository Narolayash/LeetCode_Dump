public class Problem_136 {
    public static void main(String[] args) {
        int[] num1 = {2, 2, 1};
        int[] num2 = {4, 1, 2, 1, 2};
        int[] num3 = {1};

        Solution_136 obj = new Solution_136();
        System.out.println(obj.singleNumber(num1));
        System.out.println(obj.singleNumber(num2));
        System.out.println(obj.singleNumber(num3));
    }
}

class Solution_136 {
    public int singleNumber(int[] nums) {
        int first = nums[0];

        for(int i=1; i<nums.length; i++)
            first ^= nums[i];

        return first;
    }
}
