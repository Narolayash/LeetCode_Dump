import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem_119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int indexRow = sc.nextInt();

        Solution_119 obj = new Solution_119();
        System.out.println(obj.getRow(indexRow));
    }
}

class Solution_119 {
    public int ncr(int n, int r) {
        r = Math.min(r, n-r);
        long res = 1;
        for(int i=1; i<=r; i++) res = res * (n - r + i) / i;
        return (int) res;
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> li = new ArrayList<>();
        for(int i=0; i<=rowIndex; i++) li.add(ncr(rowIndex, i));
        return li;
    }
}
