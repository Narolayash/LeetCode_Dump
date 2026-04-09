public class Problem_724 {
    public static void main(String[] args) {

    }

    public static int pivotIndex(int[] nums) {
         int lsum = 0;
         int totalSum = 0;

         for (int num : nums) totalSum += num;

         for (int i=0; i < nums.length; i++) {
             totalSum -= nums[i];

             if (lsum == totalSum) return i;

             lsum += nums[i];
         }

         return -1;
    }

// brute force
//    public static int pivotIndex(int[] nums) {
//        int lsum = 0;
//
//        for (int i=0; i < nums.length; i++) {
//            if (i - 1 >= 0) lsum += nums[i - 1];
//            int rsum = 0;
//            for (int j=i+1; j < nums.length; j++) {
//                rsum += nums[j];
//            }
//            if (lsum == rsum) return i;
//        }
//
//        return -1;
//    }
}
