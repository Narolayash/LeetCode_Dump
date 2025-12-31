public class Problem_9 {
    public static void main(String[] args) {
        int num = 1221;

        Solution_9 obj = new Solution_9();

        System.out.println(obj.isPalindrome(num));
    }
}

class Solution_9 {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x%10==0 &&x!=0)) return false;

        int revHalf = 0;
        while (x > revHalf) {
            revHalf = revHalf * 10 + (x % 10);
            x/=10;
        }

        return x == revHalf || x == revHalf / 10;
    }
}
