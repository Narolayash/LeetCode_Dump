import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_1380 {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        List<Integer> ans = new ArrayList<>();

        int maxMinRow = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            int minRow = Integer.MAX_VALUE;
            for (int j=0; j<m; j++) {
                minRow = Math.min(minRow, matrix[i][j]);
            }
            maxMinRow = Math.max(maxMinRow, minRow);
        }

        int minMaxCol = Integer.MAX_VALUE;
        for (int i=0; i<m; i++) {
            int maxCol = Integer.MIN_VALUE;
            for (int j=0; j<n; j++) {
                maxCol = Math.max(maxCol, matrix[j][i]);
            }
            minMaxCol = Math.min(minMaxCol, maxCol);
        }

        if (maxMinRow == minMaxCol) return new ArrayList<>(Arrays.asList(maxMinRow));

        return new ArrayList<>();
    }


//    public List<Integer> luckyNumbers(int[][] matrix) {
//        int n = matrix.length, m = matrix[0].length;
//        List<Integer> ans = new ArrayList<>();
//
//        for (int row=0; row<n; row++) {
//            int minIndex = minIndexFinder(matrix[row], m);
//            int val = matrix[row][minIndex];
//            if (isMaxInCol(matrix, val, minIndex, n)) ans.add(val);
//        }
//
//        return ans;
//    }
//
//    public int minIndexFinder(int[] row, int m) {
//        int minIndex = 0;
//        int minValue = row[0];
//        for (int i=1; i<m; i++) {
//            if (row[i] < minValue) {
//                minValue = row[i];
//                minIndex = i;
//            }
//        }
//
//        return minIndex;
//    }
//
//    public boolean isMaxInCol(int[][] mat, int val, int minIndex, int n) {
//        for (int i=0; i<n; i++) {
//            if (mat[i][minIndex] > val) return false;
//        }
//
//        return true;
//    }


//        2)
    // public List<Integer> searchIng(int[] arr1, int[] arr2) {
    //     Set<Integer> set = new HashSet<>();

    //     for (int num : arr2) {
    //         set.add(num);
    //     }

    //     List<Integer> ans = new ArrayList<>();

    //     for (int num : arr1) {
    //         if (set.contains(num)) {
    //             ans.add(num);
    //         }
    //     }

    //     return ans;
    // }

    // public List<Integer> luckyNumbers(int[][] matrix) {
    //     int m = matrix.length, n = matrix[0].length;

    //     int[] minRow = new int[m];
    //     int[] maxCol = new int[n];

    //     for (int i=0; i<m; i++) {
    //         int minValue = Integer.MAX_VALUE;
    //         for (int j=0; j<n; j++) {
    //             minValue = Math.min(minValue, matrix[i][j]);
    //         }
    //          minRow[i] = minValue;
    //     }

    //     for (int i=0; i<n; i++) {
    //         int maxValue = Integer.MIN_VALUE;
    //         for (int j=0; j<m; j++) {
    //             maxValue = Math.max(maxValue, matrix[j][i]);
    //         }
    //         maxCol[i] = maxValue;
    //     }

    //     return m > n ? searchIng(maxCol, minRow) : searchIng(minRow, maxCol);
    // }
}
