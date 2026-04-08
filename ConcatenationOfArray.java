public class ConcatenationOfArray {
    public static void main(String[] args) {

    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        int n = nums.length;
        System.arraycopy(nums, 0, ans, 0, n);
        System.arraycopy(nums, 0, ans, n, n);
        return ans;
    }

//    public static int[] getConcatenation(int[] nums) {
//        int[] ans = new int[2 * nums.length];
//
//        for(int i=0; i<nums.length; i++) {
//            ans[i] = ans[nums.length + i] =  nums[i];
//        }
//
//        return ans;
//    }
}
