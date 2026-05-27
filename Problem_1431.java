import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_1431 {
    public static void main(String[] args) {

    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandie = Integer.MIN_VALUE;
        for (int candie : candies) {
            maxCandie = Math.max(candie, maxCandie);
        }

        List<Boolean> list = new ArrayList<>(candies.length);

        for(int candie : candies) {
            list.add(candie + extraCandies >= maxCandie);
        }

        return list;
    }

//    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        int lnoCandie = Integer.MIN_VALUE;
//        for (int n : candies) {
//            if (n > lnoCandie) lnoCandie = n;
//        }
//
//        List<Boolean> result = new ArrayList<>();
//        for (int n : candies) {
//            result.add(n + extraCandies >= lnoCandie);
//        }
//
//        return result;
//    }
}
