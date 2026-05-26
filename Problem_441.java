public class Problem_441 {

    public int arrangeCoins(int n) {
        long start = 1, end = n;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long coins = mid * (mid + 1) / 2;

            if (coins == n) return (int)mid;

            if (coins < n) start = mid + 1;
            else end = mid - 1;
        }

        return (int)end;
    }
//
//    public int arrangeCoins(int n) {
//        return (int)Math.floor(-0.5+Math.sqrt((double)2*n+0.25));
//    }

    // many test cases are solve
//    public int arrangeCoins(int n) {
//        return (int)Math.floor((Math.sqrt(8 * n + 1) - 1) / 2.0);
//    }
}
