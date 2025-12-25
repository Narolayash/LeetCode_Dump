public class Problem_67 {
    public static void main(String[] args) {
        String str1 = "11";
        String str2 = "1";

        String str3 = "1010";
        String str4 = "1011";

//        System.out.println(str3.length());
        Solution_67 obj = new Solution_67();
        System.out.println(obj.addBinary(str1, str2));
        System.out.println(obj.addBinary(str3, str4));
    }
}

class Solution_67 {

    // this is not optimaz solution pachhi optimazztion karsuu
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;

        StringBuilder ans = new StringBuilder();
        int k = 0;

        while(i>=0 || j>=0) {
            int sum = k;

            if(i>=0) sum += a.charAt(i) - '0';
            if(j>=0) sum += b.charAt(j) - '0';

            ans.append(sum % 2);
            k = sum / 2;
            i--;
            j--;
        }

        if (k == 1) ans.append(1);

        return ans.reverse().toString();
    }
}