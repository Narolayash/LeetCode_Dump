public class Problem_1886 {
    public void transpose(int[][] mat, int n) {
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    public void reversRows(int[][] mat, int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n/2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][n-1-j];
                mat[i][n-1-j] = temp;
            }
        }
    }

    public void rotate(int[][] mat, int n) {
        transpose(mat, n);
        reversRows(mat, n);
    }

    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;

        for (int k=1; k<=4; k++) {

            boolean check = true;
            for (int i=0; i<n; i++) {
                for (int j=0; j<n; j++) {
                    if (mat[i][j] != target[i][j]) {
                        check = false;
                        break;
                    }
                }
                if (!check) break;
            }

            if (check) return true;

            rotate(mat, n);
        }

        return false;
    }
}
