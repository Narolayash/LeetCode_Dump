class Solution {
    public boolean isPalindromic(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<n; i++) {
            sb.append(String.format("%8s", Integer.toBinaryString(s.charAt(i))).replace(" ", "0"));
        }

        int left = 0;
        int right = sb.length() - 1;

        while (left < right) {
            if (sb.charAt(left) != sb.charAt(right)) return false;

            left++;
            right--;
        }

        return true;
    }
}