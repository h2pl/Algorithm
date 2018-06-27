package 牛客往年真题.笔试16年.小米;

/**
 * Created by 周杰伦 on 2018/6/15.
 */
public class 中国牛市 {

    public static void main(String[] args) {
        System.out.println(calculateMax(new int[]{3,8,5,1,7,8}));
    }
    /**
     * 计算你能获得的最大收益
     *
     * @param prices Prices[i]即第i天的股价
     * @return 整型
     */
    public static int calculateMax(int[] prices) {

        //dp有点难
//        //第i天买入的收益
//        int []buy = new int[prices.length];
//        //第i天卖出的收益
//        int []sell = new int[prices.length];
//        buy[0] = -prices[0];
//        for (int i = 1;i < prices.length;i ++) {
//            sell[i] =
//        }

        //普通算

        //买一次
//        int max = Integer.MIN_VALUE;
//        for (int i = 0;i < prices.length;i ++) {
//            for (int j = i + 1;j < prices.length;j ++) {
//                max = Math.max(max,prices[j] - prices[i]);
//            }
//        }
//
//        //第i天前买入，第j天前卖出的收益
//        int [][]dp = new int[prices.length][prices.length];
//        for (int i = 0;i < prices.length - 1;i ++) {
//            for (int j = i + 1;j < prices.length;j ++) {
//                dp[i][j] = Math.max(dp[i][j - 1], prices[j] - prices[i]);
//            }
//        }

        //王牌dp
        int firstBuy = Integer.MIN_VALUE, firstSell = 0;
        int secondBuy = Integer.MIN_VALUE, secondSell = 0;

        //购买时取负值，负值小的优先
        for (int curPrice : prices) {
            firstBuy = Math.max(firstBuy, -curPrice);
            firstSell = Math.max(firstSell, firstBuy + curPrice);
            secondBuy = Math.max(secondBuy, firstSell -curPrice);
            secondSell = Math.max(secondSell, secondBuy + curPrice);
        }
        return secondSell;

    }
}
