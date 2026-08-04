package MagicShow;

// Given a string S, compress it by replacing each run of consecutive identical
// characters with the character followed by its count. Print the compressed string.

// Input Format — a single line containing S (lowercase letters).
// Output Format — the run-length encoded string.
// Constraints — 1 ≤ |S| ≤ 10⁵ · lowercase English letters only


public class RunLengthEncoding {
    public static int compress(char[] chars) {
        int n = chars.length;
        int i = 0;
        int j = 0;

        while (j < n) {
            char curr = chars[j];
            // int count = 1;
            int temp = j;

            // while (j + 1 < n && chars[j + 1] == curr) {
            //     count++;
            //     j++;
            // }

            while (j < n && chars[j] == curr) {
                j++;
            }

            int count = j - temp;

            chars[i++] = curr;

            if (count >= 10) {
                String s = String.valueOf(count);

                for (char ch : s.toCharArray()) {
                    chars[i++] = ch;
                }
                // for (int k=0; k<s.length(); k++) {
                //     chars[i++] = s.charAt(k);
                // }
            }
            else if (count > 1)
                chars[i++] = (char)(count + '0');

            // j++;
        }

        return i;
    }
}
