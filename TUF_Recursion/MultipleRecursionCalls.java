package TUF_Recursion;

public class MultipleRecursionCalls {
    public static int fib (int n) {
        if (n <= 1) return n;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
//        0 1 2 3 4 5 6 7  8
//        0 1 1 2 3 5 8 13 21
        System.out.println(fib(2));
        System.out.println(fib(5));
        System.out.println(fib(8));
    }
}
