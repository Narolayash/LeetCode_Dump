import java.util.Arrays;
import java.util.Collections;

public class Problem_977 {
    public static void main(String[] args) {

    }

    public static int[] sortedSquares(int[] nums) {
        int i = 0, j = nums.length - 1;

        int[] result = new int[nums.length];
        int n = j;
        while (i <= j) {
            int l = Math.abs(nums[i]);
            int r = Math.abs(nums[j]);
            if (l < r) {
                result[n--] = r * r;
                j--;
            }
            else {
                result[n--] = l * l;
                i++;
            }
        }

        return result;
    }


//    public static int[] sortedSquares(int[] nums) {
//        int i=0;
//        for (int num : nums) {
//            nums[i++] = num * num;
//        }
//        Arrays.sort(nums);
//        return nums;
//    }
}
