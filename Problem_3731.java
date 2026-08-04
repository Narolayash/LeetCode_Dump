import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_3731 {

    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int tempSize = max - min + 1;
        int[] temp = new int[tempSize];

        for (int num : nums) {
            temp[num - min]++;
        }

        List<Integer> list = new ArrayList<>();
        for (int i=0; i<tempSize; i++) {
            if (temp[i] == 0) list.add(i+min);
        }

        return list;
    }


//    public List<Integer> findMissingElements(int[] nums) {
//        int n = nums.length;
//        Arrays.sort(nums);
//
//        int min = nums[0];
//        int max = nums[n - 1];
//
//        List<Integer> list = new ArrayList<>(   );
//
//        int k = 0;
//        for (int i=min; i<max; i++) {
//            if(nums[k] != i) list.add(i);
//            else k++;
//        }
//
//        return list;
//    }
}
