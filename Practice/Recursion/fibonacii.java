package Practice.Recursion;

public class fibonacii {
    public static void main(String[] args) {
        System.out.println(fiboNumber(5));
    }

    static int fiboNumber(int n) {
        if (n < 2)
            return n;

        return fiboNumber(n - 1) + fiboNumber(n - 2);
    }

//    static int fiboNumber(int n) {
//        if (n == 1) return 0;
//        if (n == 2) return 1;
//
//        return fiboNumber(n - 1) + fiboNumber(n - 2);
//    }
}
