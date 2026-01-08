import java.util.Arrays;

public class Problme_867 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        Solution_867 obj = new Solution_867();
        System.out.println(Arrays.deepToString(obj.transpose(matrix)));

    }
}

class Solution_867 {
    public int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                ans[j][i] = matrix[i][j];
            }
        }

        return ans;
    }
}
