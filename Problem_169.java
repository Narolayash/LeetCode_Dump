import java.util.Arrays;
import java.util.HashMap;

public class Problem_169 {
    public static void main(String[] args) {

    }

//    public static int majorityElement(int[] nums) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int n = nums.length;
//
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//
//            if (map.get(num) > n / 2)
//                return num;
//        }
//
//        return -1;
//    }

//    public static int majorityElement(int[] nums) {
//        int count = 0;
//        int candidate = -1;
//
//        for (int num : nums) {
//            if (count == 0) candidate = num;
//            if (num == candidate) count++;
//            else count--;
//        }
//
//        return candidate;
//    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

//    public static int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//
//        int n = nums.length;
//        if (nums[0] == nums[n/2]) return nums[0];
//        else return nums[n/2];
//    }
}
