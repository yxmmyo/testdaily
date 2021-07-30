//买卖股票的最佳时机
public class Solution_0730 {
    //暴力遍历法
    public int maxProfit1(int[] prices) {
        int ret = 0;
        for(int i = 0;i < prices.length-1;i++) {
            int j = i+1;
            while(j < prices.length) {
                int tmp = prices[j]-prices[i];
                if(tmp > ret) {
                    ret = tmp;
                }
                j++;
            }
        }
        return ret;
    }
    //
    public int maxProfit2(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0;i < prices.length;i++) {
            if(prices[i] < min) {
                min = prices[i];
            } else if(prices[i]-min > max) {
                max = prices[i]-min;
            }
        }
        return max;
    }
}
