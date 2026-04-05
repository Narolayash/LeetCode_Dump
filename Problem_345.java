public class Problem_345 {
    public static void main(String[] args) {
//        System.out.println(reverseVowels("IceCreAm"));
//        int ch = 'a';
//        System.out.println(ch);
        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {
        char[] str = s.toCharArray();

        boolean[] vow = new boolean[128];
        for (char ch : "AEIOUaeiou".toCharArray()) vow[ch] = true;

        for (int i = 0, j = str.length - 1; i < j; ) {
            if (!vow[str[i]]) { i++; continue; }
            if (!vow[str[j]]) { j--; continue; }

            char temp = str[i];
            str[i++] = str[j];
            str[j--] = temp;
        }
        return new String(str);
    }
}

//    public static String reverseVowels(String s) {
//        char[] st = s.toCharArray();
//        String vowels = "AEIOUaeiou";
//        int i = 0, j = st.length - 1;
//        while (i < j) {
//            while (vowels.indexOf(st[i]) == -1 && i < j) {
//                i++;
//            }
//            while (vowels.indexOf(st[j]) == -1 && j > i) {
//                j--;
//            }
//            if (st[i] != st[j]) {
//                char temp = st[i];
//                st[i] = st[j];
//                st[j] = temp;
//            }
//            i++;
//            j--;
//        }
//
//        return new String(st);
//    }
//}
