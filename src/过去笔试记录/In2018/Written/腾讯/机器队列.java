package 过去笔试记录.In2018.Written.腾讯;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/4/5.
 */
public class 机器队列 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String temp = input.nextLine();
        String[] ss = temp.trim().split(" ");
        int n = Integer.parseInt(ss[0]);
        int m = Integer.parseInt(ss[1]);
        int [][]mac = new int[n][2];
        int [][]task = new int[m][2];
        for(int i = 0;i < n;i ++){
            String temp1 = input.nextLine();
            String[] ss1 = temp1.trim().split(" ");
            mac[i][0] = Integer.parseInt(ss1[0]);
            mac[i][1] = Integer.parseInt(ss1[1]);
        }
        for(int i = 0;i < m;i ++){
            String temp2 = input.nextLine();
            String[] ss2 = temp2.trim().split(" ");
            task[i][0] = Integer.parseInt(ss2[0]);
            task[i][1] = Integer.parseInt(ss2[1]);
        }
        System.out.println(maxTask_Pay(n,m,mac,task));
        input.close();
    }
    public static int[] maxTask_Pay (int n,int m,int [][]mac, int[][]task) {
        int [][]dp = new int[mac.length + 1][task.length + 1];
        Arrays.sort(mac, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[0];
            }
        });
        Arrays.sort(task);
        for (int i = 1; i <= mac.length; i++) {
            if (task[0][0] <= mac[i - 1][0] && task[0][1] < mac[i - 1][1]) {
                dp[i][1] = 200 * mac[i - 1][0] + 3 * mac[i - 1][1];
            }else {
                dp[i][1] = 0;
            }
        }
        for (int i = 1; i <= task.length; i++) {
            if (task[i][0] <= mac[0][0] && task[i][1] < mac[0][1]) {
                dp[1][i] = 200 * mac[0][0] + 3 * mac[0][1];
            }else {
                dp[1][i] = 0;
            }
        }
        int count = 0;
        for (int i = 2; i <= task.length; i++) {
            for (int j = 2; j <= mac.length; j++) {
                if (task[i - 1][0] <= mac[i - 1][0] && task[i - 1][1] < mac[i - 1][1]) {
                dp[i][j] = dp[i - 1][j - 1] + 200 * mac[i - 1][0] + 3 * mac[i - 1][1];
                count ++;
                }
                else dp[i][j] = dp[i - 1][j];
            }
        }

        int []a = new int[2];
        a[0] = count;
        a[1] = dp[mac.length][task.length];
        return a;
    }
}
