public class Problem_410 {
    public int splitArray(int[] nums, int k) {
        int start = 0, end = 0;

        for (int num : nums) {
            start = Math.max(start, num);
            end += num;
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            int pieces = 0;
            int sum = 0;

            for (int num : nums) {
                if (sum + num > mid) {
                    pieces++;
                    sum = num;
                }
                else sum += num;
            }

            if (pieces > k) start = mid + 1;
            else end = mid;
        }

        return start;
    }
}
