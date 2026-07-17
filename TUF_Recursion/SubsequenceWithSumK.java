package TUF_Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceWithSumK {
    // printing subsequence whose sum is K (printing all of those)
//    public static void solve (int[] nums, int i, int sum, int k, List<Integer> list) {
//        int n = nums.length;
//
//        if (i == n) {
//            if (sum == k) {
//                System.out.println(list);
//            }
//            return;
//        }
//
//        list.add(nums[i]);
//        solve(nums, i+1, sum + nums[i], k, list);
//        list.removeLast();
//        solve(nums, i + 1, sum, k, list);
//    }



    // print any one subsequence with sum k (printing one)
    public static void solve (int[] nums, int i, int sum, int k, List<Integer> list) {

    }

    public static void main(String[] args) {

        solve(new int[] {1, 2, 1}, 0, 0, 2, new ArrayList<>());
    }
}
