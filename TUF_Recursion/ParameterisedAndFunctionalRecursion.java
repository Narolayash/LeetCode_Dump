package TUF_Recursion;

public class ParameterisedAndFunctionalRecursion {
//    Parameterised
//    public static void sumOfFirstN(int n, int sum) {
//        if (n < 1) {
//            System.out.println(sum);
//            return;
//        }
//
//        sumOfFirstN(n-1, sum + n);
//    }


//    Functional
//    public static int sumOfFirstN(int n) {
//        if (n == 0) return 0;
//
//        return n + sumOfFirstN(n - 1);
//    }


    // Task
//    public static void factorial (int n, int ans) {
//        if (n <= 1) {
//            System.out.println(ans);
//            return;
//        }
//
//        factorial(n - 1, ans * n);
//    }

    public static int factorial (int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
//        sumOfFirstN(3, 0);
//        System.out.println(sumOfFirstN(3));



//        factorial(5, 1);
        System.out.println(factorial(4));
    }
}
