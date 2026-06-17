import java.util.ArrayList;
import java.util.List;

public class Problem_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length - 1;
        int col = matrix[0].length - 1;

        List<Integer> ans = new ArrayList<>();

        int i=0, j=0;
        while (i <= row && j <= col) {
            for (int k=j; k<=col; k++) {
                ans.add(matrix[i][k]);
            }
            i++;
            for (int k=i; k<=row; k++) {
                ans.add(matrix[k][col]);
            }
            col--;
            if (i <= row) {
                for (int k=col; k>=j; k--) {
                    ans.add(matrix[row][k]);
                }
                row--;
            }

            if (j <= col) {
                for (int k=row; k>=i; k--) {
                    ans.add(matrix[k][j]);
                }
                j++;
            }
        }

        return ans;
    }
}
