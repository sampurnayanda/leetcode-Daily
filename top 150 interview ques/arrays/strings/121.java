class Solution {
    public int maxProfit(int[] prices) 
    {
        int n=prices.length;
        if(prices==null||n<2)
        {
            return 0;
        }
        int maxprofit=0;
        int minprice=prices[0];
        for(int i=1;i<n;i++)
        {
            int profit=prices[i]-minprice;
            maxprofit=Math.max(maxprofit,profit);
            minprice=Math.min(minprice,prices[i]);
        }
        return maxprofit;
    }
}