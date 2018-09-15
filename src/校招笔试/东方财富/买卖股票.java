package 校招笔试.东方财富;


import java.util.Scanner;

public class 买卖股票 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String []ss = s.split(",");
        int []arr = new int[ss.length];
        for (int i = 0;i < arr.length;i ++) {
            arr[i] = Integer.parseInt(ss[i]);
        }
        int[] res = maxProfit(arr);
        for (int i = 0;i < res.length;i ++) {
            if (i != res.length - 1) {
                System.out.print(res[i] + " ");
            }else {
                System.out.println(res[i]);
            }
        }
    }
    public static int[] maxProfit(int[] prices) {
        // these four variables represent your profit after executing corresponding transaction
        // in the beginning, your profit is 0.
        // when you buy a stock ,the profit will be deducted of the price of stock.
        int firstBuy = Integer.MIN_VALUE, firstSell = 0;
        int secondBuy = Integer.MIN_VALUE, secondSell = 0;

        int []arr = new int[4];

        for (int i = 0;i < prices.length;i ++) {
            int curPrice = prices[i];
            if (firstBuy < -curPrice) {
                firstBuy = -curPrice;
                int flag = 0;
                for (int j = 0;j < arr.length;j ++) {
                    if (arr[j] == i + 1) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    arr[0] = i + 1;
                }
            }// the max profit after you buy first stock
            if (firstSell < firstBuy + curPrice) {
                firstSell = firstBuy + curPrice;
                int flag = 0;
                for (int j = 0;j < arr.length;j ++) {
                    if (arr[j] == i + 1) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    arr[1] = i + 1;
                }
            }// the max profit after you sell it
            if (secondBuy < firstSell - curPrice) {
                secondBuy = firstSell - curPrice;
                int flag = 0;
                for (int j = 0;j < arr.length;j ++) {
                    if (arr[j] == i + 1) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    arr[2] = i + 1;
                }
                // the max profit after you buy the second stock
            }
            if (secondSell < secondBuy + curPrice) {
                secondSell = secondBuy + curPrice;
                int flag = 0;
                for (int j = 0;j < arr.length;j ++) {
                    if (arr[j] == i + 1) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    arr[3] = i + 1;
                }
            }// the max profit after you sell the second stock
        }

        return arr; // secondSell will be the max profit after passing the prices
    }
}
