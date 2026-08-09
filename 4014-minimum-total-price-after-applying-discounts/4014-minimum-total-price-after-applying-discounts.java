class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        double minDis = 0.0;
        
        Arrays.sort(prices);
        Arrays.sort(discounts);

        for (int i=0; i<prices.length/2; i++) {
            int temp = prices[i];
            prices[i] = prices[prices.length - 1 - i];
            prices[prices.length - 1 - i] = temp;
        }

        for (int i=0; i<discounts.length/2; i++) {
            int temp = discounts[i];
            discounts[i] = discounts[discounts.length - 1 - i];
            discounts[discounts.length - 1 - i] = temp;
        }
        
        for (int i=0; i<prices.length; i++) {
            if (i < discounts.length) minDis += (prices[i] * (100 - discounts[i]) / 100.0);
            else minDis += prices[i];
        }

        return minDis;
    }
}