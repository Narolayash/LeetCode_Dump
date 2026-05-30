public class Problem_1252 {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m];
        int[] cols = new int[n];

        for (int[] indice: indices) {
            rows[indice[0]]++;
            cols[indice[1]]++;
        }

        int oddRows = 0, oddCols = 0;

        for (int num : rows) {
            if ((num & 1) == 1) oddRows++;
        }

        for (int num : cols) {
            if ((num & 1) == 1) oddCols++;
        }

        return oddRows * (n - oddCols) + oddCols * (m - oddRows);
    }

    // public int oddCells(int m, int n, int[][] indices) {
    //     int[][] arr = new int[m][n];

    //     for (int[] row: indices) {
    //         for (int i=0; i<n; i++) {
    //             arr[row[0]][i]++;
    //         }
    //         for(int j=0; j<m; j++) {
    //             arr[j][row[1]]++;
    //         }
    //     }

    //     int count = 0;
    //     for (int i=0; i<m; i++) {
    //         for (int j=0; j<n; j++) {
    //             if ((arr[i][j] & 1) == 1) count++;
    //         }
    //     }

    //     return count;
    // }
}
