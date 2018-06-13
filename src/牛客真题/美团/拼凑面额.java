package 牛客真题.美团;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/6/13.
 */
public class 拼凑面额 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(dp(N));
    }
    public static long dp(int N) {
        int []arr = {1,5,10,20,50,100};
        //仅用前i种钞票构成j面额
        long [][]dp = new long[7][N + 1];
        dp[0][0] = 1;
        for (int i = 1;i <= 6;i ++) {
            dp[i][0] = 1;
        }
        for (int i = 1;i <= N;i ++) {
            dp[0][N] = 0;
        }

        for (int i = 1;i <= 6;i ++) {
            for (int j = 1;j <= N;j ++) {
                for (int k = 1;j >= k * arr[i - 1];k ++) {
                    dp[i][j] += dp[i - 1][j - k * arr[i - 1]];
                }
                dp[i][j] += dp[i - 1][j];
            }
        }
        return dp[6][N];
    }
}
