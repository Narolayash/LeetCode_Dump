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
        if (n == 0) return 0;
        if (n == 1) return 1;

        int first = 0, second = 1, third = 0;
        for(int i=2; i<=n; i++) {
            third = first + second;
            first = second;
            second = third;
        }

        return third;
    }
}
