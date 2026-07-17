public class Problem_70 {
//    Space Optimization
    public int climbStairs(int n) {
        if (n == 0 || n == 1) return n;

        int pre = 1, curr = 1;
        for (int i=2; i<=n; i++) {
            int temp = curr;
            curr += pre;
            pre = temp;
        }

        return curr;
    }



    // Tabulation
//    public int climbStairs(int n) {
//        int[] memo = new int[n + 1];
//        memo[0] = memo[1] = 1;
//
//        for (int i=2; i<=n; i++) {
//            memo[i] = memo[i-1] + memo[i-2];
//        }
//
//        return memo[n];
//    }



    // memoization
//    public int solve(int n, int[] memory) {
//        if (n == 1) return memory[1] = 1;
//        if (n == 2) return memory[2] = 2;
//
//        if (memory[n] != 0) return memory[n];
//
//        return memory[n] = solve(n-1, memory) + solve(n-2, memory);
//    }
//
//    public int climbStairs(int n) {
//        int[] memory = new int[n+1];
//
//        return solve(n, memory);
//    }
}

