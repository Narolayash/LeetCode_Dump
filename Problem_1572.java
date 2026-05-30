public class Problem_1572 {
    public int diagonalSum(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int ans = 0;
        for (int i=0; i<rows; i++) {
            ans += mat[i][i];
            if (i != cols-i-1) ans += mat[i][cols-i-1];
        }

        return ans;
    }
}
