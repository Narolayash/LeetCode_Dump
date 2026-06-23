public class Problem_1217 {
    public int minCostToMoveChips(int[] position) {
        int oddCount = 0;
        int evenCount = 0;

        for (int num : position) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }

        return Math.min(oddCount, evenCount);
    }
}
