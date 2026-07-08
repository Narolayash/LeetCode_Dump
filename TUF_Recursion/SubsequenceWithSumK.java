package TUF_Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceWithSumK {
    // printing subsequence whose sum is K
    public static boolean solve (int[] nums, int i, int sum, int k, List<Integer> list) {
        int n = nums.length;

        if (i == n) {
            if (sum == k) {
                System.out.println(list);
                return true;
            }
            return false;
        }

        list.add(nums[i]);
        if (solve(nums, i+1, sum + nums[i], k, list)) return true;
        list.removeLast();
        return solve(nums, i + 1, sum, k, list);
    }

    public static void main(String[] args) {

        solve(new int[] {3, 2, 1}, 0, 0, 3, new ArrayList<>());
    }
}
