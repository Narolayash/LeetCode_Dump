import java.util.ArrayList;
import java.util.List;

public class Problem_989 {
    public static void main(String[] args) {

    }



//    public List<Integer> addToArrayForm(int[] num, int k) {
//        List<Integer> ans = new ArrayList<>();
//        int i = num.length - 1, carry = 0;
//
//        while (i >= 0 && k > 0) {
//            num[i] += carry + (k % 10);
//            carry = num[i] / 10;
//            num[i] %= 10;
//            k /= 10;
//            i--;
//        }
//        if (i == -1) {
//            while (k > 0) {
//                ans.add(0, k % 10);
//                k /= 10;
//            }
//        }
//        if (carry != 0) ans.add(0, carry);
//        for (int value : num) {
//            ans.add(value);
//        }
//
//        return ans;
//    }

//    public List<Integer> addToArrayForm(int[] num, int k) {
//        List<Integer> ans = new ArrayList<>();
//        int carry = 0;
//        int i = num.length - 1;
//
//        while (i >= 0 || k > 0 || carry > 0) {
//            int sum = carry;
//
//            if (i >= 0)   
//                sum += num[i--];
//
//            if (k > 0) {
//                sum += k % 10;
//                k /= 10;
//            }
//
//            ans.add(sum % 10);
//            carry = sum / 10;
//        }
//
//        Collections.reverse(ans);
//        return ans;
//    }
}
