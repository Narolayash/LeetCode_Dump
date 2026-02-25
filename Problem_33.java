//public class Problem_33 {
//    public static void main(String[] args) {
//        System.out.println(search(new int[] {5,1,3}, 0));
//    }
//
//    public static int search(int[] nums, int target) {
//
//    }
//}
//
//// - - - - - pass some cases  - - - - -
////public class Problem_33 {
////    public static void main(String[] args) {
////        System.out.println(search(new int[] {5,1,3}, 0));
////    }
////
////    public static int search(int[] nums, int target) {
////        int maxIndex = maxEleIndex(nums);
////
////        if (nums[maxIndex] == target)
////            return maxIndex;
////        else {
////            int firstTry = binarySearch(nums, target, 0, maxIndex - 1);
////            if (firstTry != -1) return firstTry;
////        }
////
////        return binarySearch(nums, target, maxIndex + 1, nums.length - 1);
////    }
////
////    public static int maxEleIndex(int[] nums) {
////        int start = 0, end = nums.length - 1;
////
////        while (start < end) {
////            int mid = start + (end + start) / 2;
////
////            if (nums[mid + 1] > nums[mid])
////                start = mid + 1;
////            else
////                return mid;
////        }
////
////        return start;
////    }
////
////    public static int binarySearch(int[] nums, int target, int start, int end) {
////        while (start <= end) {
////            int mid = start + (end - start) / 2;
////
////            if (nums[mid] == target) return mid;
////
////            if (nums[mid] > target)
////                end = mid - 1;
////            else
////                start = mid + 1;
////        }
////
////        return -1;
////    }
////}
