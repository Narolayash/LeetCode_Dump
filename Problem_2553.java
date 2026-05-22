import java.util.ArrayList;
import java.util.Collections;

public class Problem_2553 {
    public static void main(String[] args) {
    }

    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=nums.length-1; i>=0; i++) {
            int num = nums[i];
            while (num > 0) {
                list.add(num % 10);
                num /= 10;
            }
        }

        Collections.reverse(list);

        int[] ans = new int[list.size()];
        for (int i=0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }

//    public int[] separateDigits(int[] nums) {
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (int num : nums) {
//            String temp = num + "";
//            int i = 0;
//            while (i < temp.length()) {
//                list.add(temp.charAt(i++) - '0');
//            }
//        }
//
//        int[] ans = new int[list.size()];
//        for (int i=0; i < list.size(); i++) {
//            ans[i] = list.get(i);
//        }
//
//        return ans;
//    }
}
