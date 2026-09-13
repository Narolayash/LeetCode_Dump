    class Solution {
        public int heightChecker(int[] heights) {
            int n = heights.length;
            int maxEle = 100;

            int[] expected = new int[n];
            int[] freq = new int[maxEle + 1];

            for (int i=0; i<n; i++) {
                freq[heights[i]]++;
            }

            for (int i=1; i<=maxEle; i++) {
                freq[i] += freq[i - 1];
            }

            for (int i=n-1; i>=0; i--) {
                expected[freq[heights[i]] - 1] = heights[i];
                freq[heights[i]]--;
            }

            int ans = 0;
            for (int i=0; i<n; i++) {   
                if (heights[i] != expected[i]) ans++;
            }

            return ans;
        }
    }