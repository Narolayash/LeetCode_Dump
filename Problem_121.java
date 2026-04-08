public class Problem_121 {
    public static void main(String[] args) {

    }

    // using brain
    // find first minprice of stock
    // from minprice to calculate maxprofit
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices) {
            if (price < minPrice)
                minPrice = price;
            else
                maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }

    // using brute force
//    public int maxProfit(int[] prices) {
//        int maxProfit = Integer.MIN_VALUE;
//
//        for (int i=0; i < prices.length - 1; i++) {
//            for (int j=i+1; j < prices.length; j++) {
//                int profit = prices[j] - prices[i];
//                if (profit > maxProfit)
//                    maxProfit = profit;
//            }
//        }
//
//        return maxProfit;
//    }
}
