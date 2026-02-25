public class Problem_1672 {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};

        Solution_Problem_1672 obj = new Solution_Problem_1672();
        System.out.println(obj.maximumWealth(accounts));
    }

//    public static int maximumWealth2(int[][] accounts) {
//        int maxWealth = Integer.MIN_VALUE;
//
//        for (int[] account : accounts) {
//            int w = wealth(account);
//            if (w > maxWealth) maxWealth = w;
//        }
//
//        return maxWealth;
//    }
//
//    static int wealth(int[] banks) {
//        int wealth = 0;
//        for (int value : banks)
//            wealth += value;
//
//        return wealth;
//    }
}


class Solution_Problem_1672 {
    public int maximumWealth(int[][] accounts) {
        int max_wealth = Integer.MIN_VALUE;

        for (int[] account : accounts) {
            int total_wealth = 0;
            for(int wealth : account) {
                total_wealth += wealth;
            }
            if (total_wealth > max_wealth) max_wealth = total_wealth;
        }

        return max_wealth;
    }
}
