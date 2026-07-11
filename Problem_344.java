public class Problem_344 {
    public static void main(String[] args) {

    }

    public static void reverseString(char[] s) {
        int i = 0, j = s.length - 1;

        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }




//    public void helper(char[] s, int i) {
//        int n = s.length;
//
//        if (i >= n / 2) {
//            return;
//        }
//
//        char temp = s[i];
//        s[i] = s[n - 1 - i];
//        s[n - 1 - i] = temp;
//
//        helper(s, i + 1);
//    }
//
//    public void reverseString(char[] s) {
//        helper(s, 0);
//    }
}
