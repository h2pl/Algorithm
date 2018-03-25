package In2018.Written.头条;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/3/24.
 */
public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(minSteps(n));
    }
    public static int minSteps(int n) {
        int[] dp = new int[n+1];
        dp[1] = 0;
        dp[2] = 1;

        for (int i = 3; i <= n; i ++) {
            dp[i] = i - 1;
            for (int j = i - 1; j > 1; j --) {
                if ((i + 1) % (2 * j) == 0) {
                    dp[i] = dp[j] + (i/j);
                    break;
                }

            }
        }
        return dp[n];
    }
}
