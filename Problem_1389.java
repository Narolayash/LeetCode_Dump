import java.util.ArrayList;
import java.util.List;

public class Problem_1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>(nums.length);

        for(int i=0; i<nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        int[] ans = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
