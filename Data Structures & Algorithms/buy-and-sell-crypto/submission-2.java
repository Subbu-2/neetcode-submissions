class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int b=0;
        int s=1;
        while(b<s && s<prices.length){
            if(prices[s] - prices[b]>=0){
                maxProfit = Math.max(maxProfit,prices[s]-prices[b]);
                s++;
            }
            else{
                b=s;
                s++;
            }
        }
        return maxProfit;
    }
}
