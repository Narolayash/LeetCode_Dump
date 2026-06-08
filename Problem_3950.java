public class Problem_3950 {
    public boolean consecutiveSetBits(int n) {
        int consecutiveCount = 0;

        while (n != 0) {
            if ((n & 3) == 3) consecutiveCount++;
            n >>= 1;
        }

        return consecutiveCount == 1;
    }

    // public boolean consecutiveSetBits(int n) {
    //     int consecutiveCount = 0;

    //     int pre = n & 1, curr = 0;
    //     while (n > 0) {
    //         curr = (n >> 1) & 1;
    //         if (pre == 1 && curr == 1) consecutiveCount++;
    //         pre = curr;
    //         n >>= 1;
    //     }

    //     return consecutiveCount == 1;
    // }
}
