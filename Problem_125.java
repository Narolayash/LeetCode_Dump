public class Problem_125 {
    public static void main(String[] args) {

    }

    public static boolean isABCD(char ch) {
        return (ch >= 'A' && ch <= 'Z') ||
                (ch >= 'a' && ch <= 'z') ||
                (ch >= '0' && ch <= '9');
    }

    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            while (i < j && !isABCD(s.charAt(i))) i++;
            while (i < j && !isABCD(s.charAt(j))) j--;

            char l = Character.toLowerCase(s.charAt(i++));
            char r = Character.toLowerCase(s.charAt(j--));

            if (l != r) return false;
        }

        return true;
    }
}
