public class Problem_507 {
    public static void main(String[] args) {
        int num = 6;

        Solution_507 obj = new Solution_507();
        System.out.println(obj.checkPerfectNumber(num));
    }
}



class Solution_507 {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for(int i=1; i <= num/2; i++) {
            if (num % i == 0) sum += i;
            if (sum > num) break;
        }
        if(num == sum ) return true;

        return false;
    }
}
