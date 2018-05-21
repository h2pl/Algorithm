package 牛客真题.网易;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/18.
 */
//难题

public class 合唱团 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String line = scanner.nextLine();
        int n = Integer.parseInt(line);

        line = scanner.nextLine();
        String[] s = line.split(" ");
        int arr[] = new int[n];
        for (int i = 0;i < n;i ++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        line = scanner.nextLine();
        String []s1 = line.split(" ");
        int k = Integer.parseInt(s1[0]);
        int d = Integer.parseInt(s1[1]);
        dp(arr, k , d);
    }

//    public static int maxMulti(int []arr, int k, int d) {
//        int max = Integer.MIN_VALUE;
//        for (int i = 0;i < arr.length;i ++) {
//            max = Math.max(max, dfs(arr, i, 0, k, d, 1));
//        }
//        return max;
//    }
//      这题不能用深度优先，因为不需要遍历所有情况，应该考虑用dp
//    public static int dfs(int arr[], int cur, int count, int k, int d, int val) {
//        if (count == k) {
//            return val;
//        }
//        int num = arr[cur];
//        val = val * num;
//
//        int max = val;
//        for (int i = cur + 1;i < arr.length;i ++) {
//            if (Math.abs(i - cur) <= d) {
//                return dfs(arr, i, count + 1, k, d, val);
//            }
//        }
//        return val;
//    }
    //dp用来表示以某个人为结尾时的最大值，由于有两个变量n和k，所以需要用二维数组。
    public static void dp(int []arr, int k, int d) {
        //dp[i][j]表示以i为最后一个人的下标并且j为已选人数
        //由于有正有负，所以两个数组一个存最大值一个存最小值
        long [][]dpn = new long[arr.length][k + 1];
        long [][]dpm = new long[arr.length][k + 1];
        //以某个元素为结尾时的最大值
        long max = Integer.MIN_VALUE;
        for (int i = 0;i < arr.length;i ++) {
            dpn[i][1] = arr[i];
            dpm[i][1] = arr[i];
            //因为一共要选k个人，所以这里再做一个循环
            for (int kk = 2; kk <= k; kk ++) {
                for (int j = i - 1; j >= 0 && i - j <= d;j -- ) {
                    //如果是正值，选大的
                    dpm[i][kk] = Math.max(dpm[i][kk], Math.max(dpm[j][kk - 1] * arr[i], dpn[j][kk - 1] * arr[i]));
                    //如果是负值，选小的
                    dpn[i][kk] = Math.min(dpn[i][kk], Math.min(dpm[j][kk - 1] * arr[i], dpn[j][kk - 1] * arr[i]));
                }
            }
            max = Math.max(dpm[i][k], max);
        }
        System.out.println(max);
    }
}
