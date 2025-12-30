import java.util.Scanner;

public class Problem_415 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1 = new String(sc.next());
        String num2 = new String(sc.next());

//        System.out.println(num1.length());
//        System.out.println(num2);

        Solution_415 obj = new Solution_415();
        System.out.println(obj.addStrings(num1, num2));
    }
}

class Solution_415 {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();

        int i=num1.length()-1, j=num2.length()-1;
        int carry = 0;
        while(i>=0 || j>=0) {
            int sum = carry;

            if(i>=0) sum +=  (num1.charAt(i--) - '0');
            if(j>=0) sum +=  (num2.charAt(j--) - '0');

            sb.append(sum % 10);
            carry = sum / 10;
        }

        return new String(sb.reverse());
    }
}
