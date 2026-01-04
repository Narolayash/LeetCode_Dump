public class Problme_231 {
    public static void main(String[] args) {
        int num = 3;

        Solution_231 obj = new Solution_231();
        System.out.println(obj.isPowerOfTwo(num));
    }
}

//class Solution_231 {
//    public boolean isPowerOfTwo(int n) {
//        if (n <= 0) return false;
//        return (n & (n - 1)) == 0;
//    }
//}

class Solution_231 {
    public boolean isPowerOfTwo(int n) {
        n = Math.abs(n);
        if (n == 0) return false;
        if (n == 1) return true;
        while (n > 1) {
            if(n % 2 != 0) return false;
            n /= 2;
        }

        return true;
    }
}