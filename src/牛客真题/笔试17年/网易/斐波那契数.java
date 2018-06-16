package 牛客真题.笔试17年.网易;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/21.
 */
public class 斐波那契数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        long n = Long.parseLong(line);
        System.out.println(min(n));
    }
    public static long min (long n) {
        for (int i = 1; i <= n;i ++) {
            if (fib(i) >= n && fib(i - 1) <= n) {
                return fib(i) - n > n - fib(i - 1) ?  n - fib(i - 1) : fib(i) - n;
            }
        }
        return 0;
    }

    public static long fib(int n) {
        if (n == 1 || n == 0)return n;
        long []dp = new long[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2;i <= n;i ++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
