public class Problem_832 {
    // public int[][] flipAndInvertImage(int[][] image) {
    //     int n = image.length;
    //     int[][] ans = new int[n][n];

    //     for (int i=0; i<n; i++) {
    //         for (int j=0; j<n; j++) {
    //             ans[i][j] = image[i][n-j-1] == 0 ? 1 : 0;
    //         }
    //     }

    //     return ans;
    // }

    // public int[][] flipAndInvertImage(int[][] image) {
    //     int n = image.length;
    //     int[][] ans = new int[n][n];

    //     for (int i=0; i<n; i++) {
    //         for (int j=0; j<n; j++) {
    //             ans[i][j] = image[i][n-j-1] ^ 1;
    //         }
    //     }

    //     return ans;
    // }

    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row: image) {
            for (int i=0; i < (row.length + 1) / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[row.length - i - 1] ^ 1;
                row[row.length - i - 1] = temp;
            }
        }

        return image;
    }
}
