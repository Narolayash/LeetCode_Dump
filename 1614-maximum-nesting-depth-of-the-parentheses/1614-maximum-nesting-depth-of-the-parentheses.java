class Solution {
    public int maxDepth(String s) {
        int maxDepth = 0;

        int currDepth = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') currDepth++;
            else if (s.charAt(i) == ')') {
                maxDepth = Math.max(maxDepth, currDepth);
                currDepth--;
            }
        }

        return maxDepth;
    }
}