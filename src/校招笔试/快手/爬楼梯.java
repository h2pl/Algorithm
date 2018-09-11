package 校招笔试.快手;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/9/10.
 */
public class 爬楼梯 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            String[] ss = s.split(",");
            int[] arr = new int[ss.length + 1];
            for (int i = 1; i < arr.length; i++) {
                arr[i] = Integer.parseInt(ss[i - 1]);
            }
            dp(arr);
        }

        public static void dp(int[] cost) {
            int[] dp = new int[cost.length];
            dp[1] = cost[1];
            for (int i = 2; i < dp.length; i++) {
                dp[i] = Math.min(dp[i - 1] , dp[i - 2]) + cost[i];
            }
            System.out.println(dp[dp.length - 1]);
        }


}
