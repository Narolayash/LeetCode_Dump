class Solution {
    public int smallestNumber(int n, int t) {
        int temp = n;
        int prod = 1;

        while (temp != 0) {
            prod *= temp % 10;
            if (prod % t == 0) return n;
            temp/=10;
        }

        return smallestNumber(n + 1, t);
    }
}