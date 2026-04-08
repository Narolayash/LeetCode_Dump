import java.util.ArrayList;

public class ShuffleTheArray {
    public static void main(String[] args) {

    }

    public static int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);

        for(int i = 1; i < nums.length - 1; i++) {
            if (i % 2 != 0) {
                list.add(i, nums[n++]);
            }
            else {
                list
            }
        }

        list.add(nums[nums.length - 1]);
    }
}
