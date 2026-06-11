public class Problem_326 {
    public boolean isPowerOfThree(int n) {
//         if (n <= 0) return false;
//         while (n % 3 == 0) n /= 3;
//         return n == 1;


        return solve(n);
    }

        public boolean solve(int n) {
            if (n <= 0) return false;
            if (n == 1) return true;

            if (n % 3 == 0) return solve(n / 3);

            else return false;

    }
}
