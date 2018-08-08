package 校招笔试.华为;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/8/8.
 */
public class 小偷偷东西问题 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String []ss = s.split(",");
        int []value = new int[ss.length];
        int []weight = new int[ss.length];
        for (int i = 0;i < value.length;i ++) {
            value[i] = Integer.parseInt(ss[i]);
        }
        s = scanner.next();
        ss = s.split(",");
        for (int i = 0;i < weight.length;i ++) {
            weight[i] = Integer.parseInt(ss[i]);
        }
        int capacity = scanner.nextInt();
        System.out.println(maxValue(value, weight, capacity));
    }

    public static int maxValue(int []value, int []weight, int capacity) {
        int [][]dp = new int[value.length + 1][capacity + 1];
        for(int i = 1;i <= value.length;i++)
        {
            for(int j = 1;j <= capacity;j++)
            {
                if(j >= weight[i - 1])
                    dp[i][j] = Math.max(dp[i - 1][j],dp[i - 1][j - weight[i - 1]] + value[i - 1]);
                else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[value.length][capacity];
    }
}
