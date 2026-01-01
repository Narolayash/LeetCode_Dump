public class Problem_258 {
    public static void main(String[] args) {
        int num = 38;

        Solution_258 obj = new Solution_258();
        System.out.println(obj.addDigits(num));
    }
}

class Solution_258 {
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
             while (num != 0) {
                 sum += num%10;
                 num /= 10;
             }
             num = sum;
        }
        return num;
    }
}
