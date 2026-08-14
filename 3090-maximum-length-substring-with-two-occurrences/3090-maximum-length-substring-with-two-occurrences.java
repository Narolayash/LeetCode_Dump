class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int[] occurrence = new int[32];

        int i=0;
        int j=0;
        
        int max = Integer.MIN_VALUE;
        while (j < n) {
            occurrence[s.charAt(j) - 'a']++;

            while (occurrence[s.charAt(j) - 'a'] > 2) {
                occurrence[s.charAt(i) - 'a']--;
                i++;
            }
            
            j++;
            max = Math.max(j-i, max);
        }

        return max;
    }
}