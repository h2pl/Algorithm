package 牛客真题.笔试17年.美团;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/6/13.
 */
public class 网格走法数目 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(dp(x, y));
    }
    public static int dp(int x,int y) {
        //从起点到i,j的走法总数
        int [][]dp = new int[x + 1][y + 1];
        for (int i = 1;i <= y;i ++) {
            dp[0][i] = 1;
        }
        for (int i = 1;i <= x;i ++) {
            dp[i][0] = 1;
        }
        for (int i = 1;i <= x;i ++) {
            for (int j = 1;j <= y;j ++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[x][y];
    }
}
