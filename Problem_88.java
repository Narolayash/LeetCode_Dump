
import java.util.Arrays;

public class Problem_88 {

    public static void main(String[] args) {
//        int[] num1 = {1, 2, 3, 0, 0, 0};
//        int[] num2 = {2, 5, 6};

        int[] num1 = {0};
        int[] num2 = {1};

        Solution_88 obj = new Solution_88();
        obj.merge(num1, 0, num2, 1);
//        obj.merge(num1, 3, num2, 3);
        System.out.println(Arrays.toString(num1));
    }
}

class Solution_88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (k > 0) {
            if (nums1[i] < nums2[j]) {
                nums1[k--] = nums2[j--]; 
            }else {
                nums1[k--] = nums1[i--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
