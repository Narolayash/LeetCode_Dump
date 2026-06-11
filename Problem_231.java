public class Problem_231 {
    public boolean isPowerOfTwo(int n) {
//        return n > 0 && (n & n-1) == 0;



        // if(n <= 0) return false;
        // if (n == 1) return true;
        // while (n > 1) {
        //     if(n % 2 != 0) return false;
        //     n /= 2;
        // }
        // return true;



        // if (n <= 0) return false;
        // return (n & n-1) == 0;


        return solve(n);
    }


    // recursion way to solve
    public boolean solve(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;

        if (n % 2 == 0) return solve(n / 2);
        else return false;
    }
}
