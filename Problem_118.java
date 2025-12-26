import java.util.ArrayList;
import java.util.List;

public class Problem_118 {
    public static void main(String[] args) {
        Solution_118 obj = new Solution_118();

        System.out.println(obj.generate(5));
    }
}

class Solution_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j == 0 || j == i) row.add(1);
                else row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }
            result.add(row);
        }
        return result;
    }
}
