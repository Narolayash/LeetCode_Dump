//package array_II;
//
//public class Set_Mismatch {
//    public static void main(String[] args) {
//
//    }
//
//    public static int[] findErrorNums(int[] nums) {
//        int dupIndex;
//        for (int i=1; i < nums.length; i++) {
//            if (nums[i - 1] == nums[i]) {
//                dupIndex = i - 1;
//                break;
//            }
//        }
//
//        return new int[2] {nums[dupIndex], nums[dupIndex + 1]};
//    }
//}
