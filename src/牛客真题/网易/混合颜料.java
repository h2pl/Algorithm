package 牛客真题.网易;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/20.
 */

//错误
public class 混合颜料 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int n = Integer.parseInt(line);
        line = scanner.nextLine();
        String []s = line.split(" ");
        long []arr = new long[n];
        for (int i = 0;i < n;i ++) {
            arr[i] = Long.parseLong(s[i]);
        }
        System.out.println(mix(arr));
    }
    //求最小值，想到dp
    public static int mix(long []arr) {
        //由于1 ^ 2 = 3,2 ^ 3 = 1, 3 ^ 1 = 2，所以颜料的顺序没有关系。我们可以先排序。
        //a ^ a = 0  a ^ 0 = a  a ^ a ^ b = b
        //完成前n个颜色需要几种颜料
        int []dp = new int[arr.length + 1];
        dp[0] = 0;
        dp[1] = 1;
        long mix = 0;
        for (int i = 1; i < arr.length;i ++) {
            if (arr[i] == (mix ^ arr[i - 1])) {
                dp[i + 1] = dp[i];
            }else {
                dp[i + 1] = dp[i] + 1;
                mix = mix ^ arr[i];
            }
        }
        return dp[arr.length];
    }
}
