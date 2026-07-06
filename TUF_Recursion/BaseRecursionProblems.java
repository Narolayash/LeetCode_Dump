package TUF_Recursion;

public class BaseRecursionProblems {
    // time complexity: O(n)
    // space complexity: O(n)
    public static void print_name(int time) {
        if (time == 0) return;

        System.out.println("My Name is Boom Boom!");
        print_name(time - 1);
    }

    // time complexity: O(n)
    // space complexity: O(n)
    public static void print_1_to_N(int i, int n) {
        if (i > n) return;

        System.out.println(i);
        print_1_to_N(i+1, n);
    }

    // time complexity: O(n)
    // space complexity: O(n)
//    public static void print_N_to_1(int i, int n) {
//        if (i > n) return;
//
//        print_N_to_1(i+1, n);
//        System.out.println(i);
//    }

    // time complexity: O(n)
    // space complexity: O(n)
    public static void print_N_to_1(int n) {
        if (n == 0) return;

        System.out.println(n);
        print_N_to_1(n - 1);
    }

    public static void main(String[] args) {
//        task - 1
//        print_name(5);

//        task - 2
//        print_1_to_N(1, 10);

//        task - 3
//        print_N_to_1(1, 10);
//        print_N_to_1(10);

//        task - 4
    }
}
