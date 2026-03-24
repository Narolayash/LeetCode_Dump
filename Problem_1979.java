public class Problem_1979 {
    public static void main(String[] args) {

    }

    static public int findGCD(int[] nums) {
//        int maxNum = maximum(nums);
//        int minNum = minimum(nums);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i : nums) {
            if (min > i) min = i;
            if (max < i) max = i;
        }

        return gcd(min, max);
    }

    private static int gcd(int minNum, int maxNum) {
        int rem = maxNum % minNum;
        while (rem != 0) {
            maxNum = minNum;
            minNum = rem;
            rem = maxNum % minNum;
        }

        return minNum;
    }



    private static int minimum(int[] nums) {
        int min = Integer.MAX_VALUE;

        for (int i : nums) {
            if (min > i)
                min = i;
        }

        return  min;
    }

    private static int maximum(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i : nums) {
            if (max < i)
                max = i;
        }

        return max;
    }
}
