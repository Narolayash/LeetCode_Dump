public class Problem_1295 {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if ((((int) Math.log10(num) + 1) & 1) == 0) count++;
        }

        return count;
    }
    // public int findNumbers(int[] nums) {
    //     int count = 0;

    //     for (int i = 0; i < nums.length; i++) {
    //         if (digits(nums[i]) % 2 == 0) count++;
    //     }
    //     return count;
    // }

    // public int digits(int num) {
    //     return (int) Math.log10(num) + 1;
    // }
}
