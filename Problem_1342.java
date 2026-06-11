public class Problem_1342 {
    public int numberOfSteps(int num) {
        return solve(num);
    }

    public int solve(int n) {
        if (n == 0) return n;

        if (n % 2 == 0) return 1 + solve(n / 2);
        return 1 + solve(n - 1);
    }



//    public int numberOfSteps(int num) {
//        int step = 0;
//        while (num != 0) {
//            if (num % 2 == 0) {
//                step++;
//                num /= 2;
//            }
//            else {
//                step++;
//                num -= 1;
//            }
//        }
//
//        return step;
//    }
}
