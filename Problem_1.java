
import java.util.HashMap;

public class Problem_1 {

    public static void main(String[] args) {

    }

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
