package 校招笔试.网易;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/8/11.
 */
public class 瞌睡 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int []point = new int[n];
        for (int i = 0;i < n;i ++) {
            point[i] = scanner.nextInt();
        }
        int []wake = new int[n];
        for (int i = 0;i < n;i ++) {
            wake[i] = scanner.nextInt();
        }
        System.out.println(maxCnt(point, wake, k));
    }
    public static int maxCnt (int []point, int []wake, int k) {
        int cnt = 0;
        for (int i = 0;i < point.length;i ++) {
            if (wake[i] == 1) {
                cnt += point[i];
            }
        }
        int max = cnt;
        for (int i = 0;i < point.length;i ++) {
            int temp = cnt;
            if (wake[i] == 0) {
                for (int j = i;j < i + k && j < point.length;j ++) {
                    if (wake[j] == 0) {
                        temp += point[j];
                    }
                }
                max = Math.max(temp, max);
            }
        }
        return max;
    }
}
