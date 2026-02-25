import java.util.Arrays;

public class Problem_1929 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[] {1,2,1})));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];

        int i = 0;
        for(int value : nums)
            ans[i++] = ans[i + nums.length - 1] = value;

        return ans;
    }
}
