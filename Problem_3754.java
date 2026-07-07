public class Problem_3754 {
    public long sumAndMultiply(int n) {
        int x = 0;
        long sum = 0;
        int i = 1;

        while (n != 0) {
            int rem = n % 10;
            n /= 10;
            if (rem == 0) continue;
            x += rem * i;
            sum += rem;
            i *= 10;
        }

        return sum * x;
    }
}
