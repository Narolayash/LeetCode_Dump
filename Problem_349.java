import java.util.*;

public class Problem_349 {
    public static void main(String[] args) {

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        boolean[] exists = new boolean[1001];
        for (int num : nums1) {
            exists[num] = true;
        }

        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int i = 0;
        for (int num : nums2) { 
            if (exists[num]) {
                result[i++] = num;
                exists[num] = false;
            }
        }

        return Arrays.copyOf(result, i);
    }

//    public static int[] intersection(int[] nums1, int[] nums2) {
//        HashSet<Integer> set = new HashSet<>();
//        HashSet<Integer> result = new HashSet<>();
//
//        for (int num : nums1) {
//            set.add(num);
//        }
//
//        for (int num : nums2) {
//            if (set.contains(num)) result.add(num);
//        }
//
//        int[] res = new int[result.size()];
//        int i = 0;
//        for (int num : result) {
//            res[i++] = num;
//        }
//
//        return res;
//    }
}
