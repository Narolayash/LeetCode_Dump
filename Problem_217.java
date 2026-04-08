import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem_217 {
    public static void main(String[] args) {

    }

    // using sorting
    // O(n log n)
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for(int i=1; i < nums.length; i++) {
            if (nums[i] == nums[i-1])
                return true;
        }

        return false;
    }

    // using brute force
    // O(n^2)
//    public static boolean containsDuplicate(int[] nums) {
//        for(int i=0; i<nums.length-1; i++) {
//            for(int j=i+1; j<nums.length; j++) {
//                if (nums[i] == nums[j]) return true;
//            }
//        }
//
//        return false;
//    }


    // using Hash Set
    // O(n)
//    public static boolean containsDuplicate(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//
//        for (int num : nums) {
//            if(!set.add(num))
//                return true;
//        }
//
//        return false;
//    }

//    public static boolean containsDuplicate(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//
//        for (int num : nums) {
//            if (set.contains(num))
//                return true;
//
//            set.add(num);
//        }
//
//        return false;
//    }
}
