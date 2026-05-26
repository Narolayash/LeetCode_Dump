public class Problem_3120 {
    public int numberOfSpecialChars(String word) {
        boolean[] upperAlpha = new boolean[26];
        boolean[] lowerAlpha = new boolean[26];

        for (char ch: word.toCharArray()) {
            if (Character.isUpperCase(ch)) upperAlpha[ch - 'A'] = true;
            else lowerAlpha[ch - 'a'] = true;
        }

        int ans = 0;
        for (char ch: word.toCharArray()) {
            if (Character.isUpperCase(ch) && lowerAlpha[ch - 'A']) {
                ans++;
                lowerAlpha[ch - 'A'] = false;
            }
        }

        return ans;
    }

//    public int numberOfSpecialChars(String word) {
//        boolean[] upperAlpha = new boolean[26];
//        boolean[] lowerAlpha = new boolean[26];
//
//        for (char ch: word.toCharArray()) {
//            if (Character.isUpperCase(ch)) upperAlpha[ch - 'A'] = true;
//            else lowerAlpha[ch - 'a'] = true;
//        }
//
//        int ans = 0;
//        for (int i=0; i<26; i++) {
//            if (upperAlpha[i] && lowerAlpha[i]) ans++;
//        }
//
//        return ans;
//    }

//    public int numberOfSpecialChars(String word) {
//        int[] alphas = new int[52];
//
//        for (char ch : word.toCharArray()) {
//            if (ch >= 'a' && ch <= 'z') alphas[ch - 'a'] = 1;
//            if (ch >= 'A' && ch <= 'Z') alphas[(int)ch - 39] = 1;
//        }
//
//        int ans = 0;
//        for (char ch : word.toCharArray()) {
//            if (ch >= 'a' && ch <= 'z' && alphas[(int)ch - 97 + 26] == 1) {
//                ans += 1;
//                alphas[(int)ch - 97 + 26] = 0;
//            }
//        }
//
//        return ans;
//    }
}
