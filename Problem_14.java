public class Problem_14 {
    public String longestCommonPrefix(String[] strs) {
        char[] commonPrefix = new char[201];

        int i = 0;
        for (char ch : strs[0].toCharArray()) {
            commonPrefix[i++] = ch;
        }

        for (int j=1; j<strs.length; j++) {
            int k = 0;
            for (char ch : strs[j].toCharArray()) {
                if (k >= i || ch != commonPrefix[k]) {
                    break;
                }
                k++;
            }
            i = k;
        }

        char[] copy = new char[i];
        System.arraycopy(commonPrefix, 0, copy, 0, i);

        return new String(copy);
    }
}

