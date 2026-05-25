public class Problem_367 {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;
        long start = 1, end = num / 2;

        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (mid == num / mid && mid * mid == num) return true;

            if (mid < num / mid) start = mid + 1;
            else end = mid - 1;
        }

        return false;
    }
}
