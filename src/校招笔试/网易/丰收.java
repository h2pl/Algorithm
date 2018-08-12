package 校招笔试.网易;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/8/11.
 */
public class 丰收 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];
        int cur = 0;
        //之前苹果的数量
        int []pre = new int[n + 1];
        for (int i = 0;i < n;i ++) {
            arr[i] = scanner.nextInt();
            cur += arr[i];
            pre[i + 1] = cur;
        }
        int m = scanner.nextInt();
        int []q = new int[m];
        for (int i = 0;i < m;i ++) {
            q[i] = scanner.nextInt();
        }
        for (int i = 0;i < m;i ++) {
            System.out.println(which(pre, q[i]));
        }
    }
    public static int which(int []pre, int q) {
        int cur = 0;
        for (int i = 1;i < pre.length;i ++) {
            if (pre[i] >= q) {
                return i;
            }
        }
        return 0;
    }
}
