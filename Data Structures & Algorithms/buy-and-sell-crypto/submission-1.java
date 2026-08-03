class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int l = 0, r = 1;
        int len = prices.length;
        while(r < len){
            if(prices[r] < prices[l]){
                l = r;
            }
            maxProfit = Math.max(prices[r]-prices[l], maxProfit);
            r++;
        }
        return maxProfit;
    }
}
