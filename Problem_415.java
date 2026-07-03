import java.util.Scanner;

public class Problem_415 {
    public String addStrings(String num1, String num2) {
        int n1 = num1.length(), n2 = num2.length();
        int max = Math.max(n1, n2);
        char[] ans = new char[max + 1];

        int i = n1 - 1, j = n2 - 1, k = max - 1;
        int carry = 0;
        while (i >= 0 || j >=0 || carry > 0) {
            int sum = carry;

            if (i >= 0) sum += (num1.charAt(i--) - '0');
            if (j >= 0) sum += (num2.charAt(j--) - '0');

            ans[k--] = (char)(sum % 10 + '0');
            carry = sum / 10;
        }

        return new String(ans);
    }



//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String num1 = new String(sc.next());
//        String num2 = new String(sc.next());
//
////        System.out.println(num1.length());
////        System.out.println(num2);
//
//        Solution_415 obj = new Solution_415();
//        System.out.println(obj.addStrings(num1, num2));
//    }
}

//class Solution_415 {
//    public String addStrings(String num1, String num2) {
//        StringBuilder sb = new StringBuilder();
//
//        int i=num1.length()-1, j=num2.length()-1;
//        int carry = 0;
//        while(i>=0 || j>=0) {
//            int sum = carry;
//
//            if(i>=0) sum +=  (num1.charAt(i--) - '0');
//            if(j>=0) sum +=  (num2.charAt(j--) - '0');
//
//            sb.append(sum % 10);
//            carry = sum / 10;
//        }
//
//        if(carry != 0 ) sb.append(carry);
//        return new String(sb.reverse());
//    }
//}
