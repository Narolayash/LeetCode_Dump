class Solution {
    public String[] createGrid(int m, int n) {
        char[][] grid = new char[m][n];

        // Fill the grid with obstacles
        for (int i = 0; i < m; i++) {
            Arrays.fill(grid[i], '#');
        }

        if (m == 1) {
            // Single row
            for (int j = 0; j < n; j++) {
                grid[0][j] = '.';
            }
        } else if (n == 1) {
            // Single column
            for (int i = 0; i < m; i++) {
                grid[i][0] = '.';
            }
        } else {
            // First row: go right till column n-2
            for (int j = 0; j < n - 1; j++) {
                grid[0][j] = '.';
            }

            // Column n-2: go down
            for (int i = 1; i < m; i++) {
                grid[i][n - 2] = '.';
            }

            // Destination cell
            grid[m - 1][n - 1] = '.';
        }

        String[] ans = new String[m];
        for (int i = 0; i < m; i++) {
            ans[i] = new String(grid[i]);
        }

        return ans;
    }
}