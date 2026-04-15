
import java.util.HashMap;

public class Problem_1 {

    public static void main(String[] args) {

    }

//    using loops
//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < (nums.length-1); i++){
//            for (int j = (i+1); j < nums.length; j++){
//                if (nums[i] + nums[j] == target){
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;
//    }

    // using Hash Map
    public static int[] twoSum(int[] numbs, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbs.length; i++) {
            int temp = target - numbs[i];

            if (map.containsKey(temp)) {
                return new int[]{map.get(temp), i};
            }

            map.put(numbs[i], i);
        }

        return new int[]{};
    }
}
