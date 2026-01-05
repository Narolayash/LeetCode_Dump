public class Problem_342 {
    public static void main(String[] args) {
        int num = 16;

        Solution_342 obj = new Solution_342();
        System.out.println(obj.isPowerOfFour(num));
    }
}

class Solution_342 {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;

        while (n % 4 == 0) n /= 4;

        return n == 1;
    }
}
