public class Problem__1295 {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};

        Solution__1295 sol = new Solution__1295();
        System.out.println(sol.findNumbers(nums));
    }
}

class Solution__1295 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (((int) Math.log10(i) + 1) % 2 == 0) count++;
        }
        return count;
    }
}

//class Solution__1295 {
//    public int findNumbers(int[] nums) {
//        int count = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (digits(nums[i]) % 2 == 0) count++;
//        }
//        return count;
//    }
//
//    public int digits(int num) {
//        return (int) Math.log10(num) + 1;
//    }
//}
