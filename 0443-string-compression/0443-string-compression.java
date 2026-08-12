class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int i = 0;
        int j = 0;

        while (j < n) {
            char curr = chars[j];
            int temp = j;

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
            }
            else if (count > 1) 
                chars[i++] = (char)(count + '0');

        }

        return i;
    }
}