public class Problem_1768 {
    public static void main(String[] args) {

    }

    public static String mergeAlternately(String word1, String word2) {
        int n1 = word1.length(), n2 = word2.length();
        char[] ans = new char[n1 + n2];

        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (k % 2 == 0) ans[k++] = word1.charAt(i++);
            else ans[k++] = word2.charAt(j++);
        }
        while (i < n1) {
            ans[k++] = word1.charAt(i++);
        }
        while (j < n2) {
            ans[k++] = word2.charAt(j++);
        }

        return new String(ans);
    }
}
