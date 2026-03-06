public class Problem_33 {
    public static void main(String[] args) {
        System.out.println(search(new int[] {4,5,6,7,0,1,2  }, 3));
    }

    public static int pivotIndex(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1])
                return mid;
            if (mid > start && nums[mid] < nums[mid - 1])
                return mid - 1;
            if (nums[mid] < nums[start])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return -1;
    }

    public static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) return mid;
            if (nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }

        return -1;
    }

    public static int search(int[] nums, int target) {
        int maxIndex = pivotIndex(nums);
        if (maxIndex == -1)
            return binarySearch(nums, target, 0, nums.length - 1);

        if (nums[maxIndex] == target)
            return maxIndex;
        else if (nums[maxIndex] > target)
            return binarySearch(nums, target, maxIndex + 1, nums.length);
        else
            return binarySearch(nums, target, 0, maxIndex - 1);
    }
}


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
