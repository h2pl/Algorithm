package 牛客真题.笔试17年.滴滴;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/27.
 */
public class 连续最大和 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];
        for (int i = 0;i < n;i ++) {
            arr[i] = scanner.nextInt();
        }
        long max = max(arr);
        System.out.println(max);
    }

    public static long max(int []arr) {
        long max = arr[0];
        long sum = arr[0];
        for (int i = 0;i < arr.length;i ++) {
            if (sum + arr[i] < 0) {
                sum = 0;
            }else {
                sum += arr[i];
                max = Math.max(max, sum);
            }
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    //这个是连续子序列的做法，不合适。
//    public static int dp(int []arr) {
//        int []dp = new int[arr.length + 1];
//        dp[0] = 0;
//        dp[1] = arr[1];
//        int max = Integer.MIN_VALUE;
//        for (int j = 0;j < arr.length;j ++) {
//            for (int i = j + 1; i <= arr.length; i++) {
//                if (arr[i - 1] >= 0) {
//                    dp[i] = Math.max(dp[i], dp[i - 1] + arr[i - 1]);
//                } else {
//                    dp[i] = Math.max(dp[i - 1], dp[i]);
//                }
//            }
//            max = Math.max(max, dp[arr.length]);
//        }
//        return max;
//    }
}
