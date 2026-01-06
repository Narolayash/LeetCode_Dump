public class Problme_326 {
    public static void main(String[] args) {
        int num = 27;

        Solution_326 obj = new Solution_326();
        System.out.println(obj.isPowerOfThree(num));

    }
}

class Solution_326 {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        while (n % 3 == 0) n /= 3;
        return n == 1;
    }
}
