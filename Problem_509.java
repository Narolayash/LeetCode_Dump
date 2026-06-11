import java.util.Scanner;

public class Problem_509 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Solution_509 obj = new Solution_509();
        System.out.println(obj.fib(sc.nextInt()));
    }
}

class Solution_509 {
    public int fib(int n) {
        int[] past = new int[n+1];
        return solve(n, past);
    }

    public int solve(int n, int[] past) {
        if (n <= 1) return n;
        if (past[n] != 0) return past[n];

        return past[n] = solve(n-1, past) + solve(n-2, past);
    }




//    public int fib(int n) {
//        if (n == 0) return 0;
//        if (n == 1) return 1;
//
//        int first = 0, second = 1, third = 0;
//        for(int i=2; i<=n; i++) {
//            third = first + second;
//            first = second;
//            second = third;
//        }
//
//        return third;
//    }






//    public int fib(int n) {
//        if (n <= 1) return n;
//        return fib(n - 1) + fib(n - 2);
//    }
}
