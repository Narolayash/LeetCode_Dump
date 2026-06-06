public class Problem_1304 {
    public int[] sumZero(int n) {
        int[] ans = new int[n];

        for (int i=0; i<n/2; i++) {
            ans[i] = i+1;
            ans[n-1-i] = -i-1;
        }

        return ans;
    }

    // public int[] sumZero(int n) {
    //     int[] ans = new int[n];

    //     if ((n & 1) == 1) {
    //         ans[n / 2] = 0;

    //         int i=0;
    //         while (i < n / 2) {
    //             ans[i] = i+1;
    //             ans[n-1-i] = ~i;
    //             i++;
    //         }
    //     }
    //     else {
    //         int i=0;
    //        while (i < n / 2) {
    //             ans[i] = i+1;
    //             ans[n-1-i] = ~i;
    //             i++;
    //         }
    //     }

    //     return ans;
    // }

    // public int[] sumZero(int n) {
    //     int[] A = new int[n];
    //     for (int i = 0; i < n; ++i)
    //         A[i] = i * 2 - n + 1;
    //     return A;
    // }
}
