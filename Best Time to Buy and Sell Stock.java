class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++) 
        {
            if(min>prices[i])
                min=prices[i];
            if(maxprofit<prices[i]-min)
                maxprofit=prices[i]-min;
        }
        return maxprofit;
    }
}
