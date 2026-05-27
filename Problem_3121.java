import java.util.Arrays;

public class Problem_3121 {
    public int numberOfSpecialChars(String word) {
        int[] upper = new int[26];
        int[] lower = new int[26];
        Arrays.fill(upper, -1);
        Arrays.fill(lower, -1);

        char[] chs = word.toCharArray();
        for (int i=0; i<word.length(); i++) {
            if (chs[i] >= 'a')
                lower[chs[i] - 'a'] = i;
            else if (upper[chs[i] - 'A'] == -1)
                upper[chs[i] - 'A'] = i;
        }

        int ans = 0;
        for(int i=0; i<26; i++) {
            if (lower[i] != -1 && lower[i] < upper[i]) ans++;
        }

        return ans;
    }

//    public int numberOfSpecialChars(String word) {
//        int[] upper = new int[26];
//        int[] lower = new int[26];
//
//        Arrays.fill(upper, -1);
//        Arrays.fill(lower, -1);
//
//        for (int i = 0; i < word.length(); i++) {
//            char ch = word.charAt(i);
//
//            if (Character.isLowerCase(ch)) {
//                lower[ch - 'a'] = i;
//            }
//            else if (upper[ch - 'A'] == -1) {
//                upper[ch - 'A'] = i;
//            }
//        }
//
//        int ans = 0;
//        for (int i=0; i<26; i++) {
//            if (lower[i] != -1 && lower[i] < upper[i]) ans++;
//        }
//
//        return ans;
//    }

//    public int numberOfSpecialChars(String word) {
//        int[] upper = new int[26];
//        int[] lower = new int[26];
//
//        char[] w = word.toCharArray();
//
//        for (char ch : w) {
//            if (Character.isLowerCase(ch))
//                lower[ch - 'a'] = word.lastIndexOf(ch);
//            else
//                upper[ch - 'A'] = word.indexOf(ch);
//        }
//
//        int ans = 0;
//        for (char ch : w) {
//            if (Character.isLowerCase(ch) && lower[ch - 'a'] < upper[ch - 'a']) {
//                lower[ch - 'a'] = upper[ch - 'a'] = 0;
//                ans++;
//            }
//        }
//
//        return ans;
//    }
}
