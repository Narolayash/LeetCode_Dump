import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_1431 {
    public static void main(String[] args) {

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int lnoCandie = Integer.MIN_VALUE;
        for (int n : candies) {
            if (n > lnoCandie) lnoCandie = n;
        }

        List<Boolean> result = new ArrayList<>();
        for (int n : candies) {
            result.add(n + extraCandies >= lnoCandie);
        }

        return result;
    }
}
