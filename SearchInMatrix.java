public class SearchInMatrix {
    public static void main(String[] args) {
        // searching in matrix which is sorted row wise and column wise...
        int[][] matrix = {{10, 20, 30, 40}, {15, 25, 35, 45}, {28, 29, 37, 49}, {33, 34, 38, 50}};
        int target = 31;

        int n = matrix.length;
        int m = matrix[0].length;

        int i = 0;
        int j = m - 1;

        boolean found = false;
        while (i != n && j != -1) {
            if (matrix[i][j] == target) {
                System.out.println(i + " " + j);
                found = true;
            }

            if (matrix[i][j] > target) j--;
            else i++;
        }

        if (!found) System.out.println("element not found");
    }
}
