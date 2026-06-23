public class Problem_867 {
    public void solve (int[][] matrix, int[][] ans, int i, int j) {
        if (i >= matrix.length) return;

        if (j >= matrix[0].length) {
            solve (matrix, ans, i+1, 0);
            return;
        }

        ans[j][i] = matrix[i][j];
        solve (matrix, ans, i, j+1);
    }

    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] ans = new int[cols][rows];

        solve(matrix, ans, 0, 0);
        return ans;
    }






//    public int[][] transpose(int[][] matrix) {
//        int rows = matrix.length;
//        int cols = matrix[0].length;
//
//        int[][] ans = new int[cols][rows];
//
//        for (int i=0; i<cols; i++) {
//            for (int j=0; j<rows; j++) {
//                ans[i][j] = matrix[j][i];
//            }
//        }
//
//        return ans;
//    }
}
