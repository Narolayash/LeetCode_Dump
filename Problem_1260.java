import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_1260 {
    public void oneShift(int[][] arr, int row, int col) {
        int last = arr[row - 1][col - 1];

        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                int temp = arr[i][j];
                arr[i][j] = last;
                last = temp;
            }
        }
    }

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        while (k > 0) {
            oneShift(grid, grid.length, grid[0].length);
            k--;
        }

        return (List) Arrays.asList(grid);
    }




//    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
//        int m = grid.length;
//        int n = grid[0].length;
//        int noOfEle = n * m;
//        k %= noOfEle;
//
//        int[][] shift = new int[m][n];
//        int j = 0;
//        List<List<Integer>> ans = new ArrayList<>();
//        for (int i=noOfEle - k; i<noOfEle; i++) {
//            shift[j / n][j % n] = grid[i / n][i % n];
//            j++;
//        }
//
//        for (int i=0; i<noOfEle - k; i++) {
//            shift[j / n][j % n] = grid[i / n][i % n];
//            j++;
//        }
//
//        for (int[] row : shift) {
//            List<Integer> sm = new ArrayList<>();
//
//            for (int x : row) {
//                sm.add(x);
//            }
//
//            ans.add(sm);
//        }
//
//        return ans;
//    }
}
