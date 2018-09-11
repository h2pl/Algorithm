package 校招笔试.百度;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/9/11.
 */
public class 花盆喷泉 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int [][]pos = new int[n][2];
        for (int i = 0;i < n;i ++) {
            pos[i][0] = scanner.nextInt();
            pos[i][1] = scanner.nextInt();
        }
        minMulti(x1, y1, x2, y2, pos);
    }
    public static void minMulti(int x1, int y1, int x2, int y2, int[][]pos) {
        long r1 = 0;
        long r2 = 0;
        for (int[] go : pos) {
            int x = go[0];
            int y = go[1];
            long len1 = (x1 - x)*(x1 - x) + (y1 - y)*(y1 - y);
            long len2 = (x2 - x)*(x2 - x) + (y2 - y)*(y2 - y);
            if (len1 > len2) {
                r2 = Math.max(r2, len2);
            }else {
                r1 = Math.max(r1, len1);
            }
        }
        long dis1 = r1 + (x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2);
        long dis2 = r2 + (x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2);

        if (dis1 <= r2) {
            System.out.println(r2);
        }else if (dis2 <= r1){
            System.out.println(r1);
        }else {
            System.out.println(r1 + r2);
        }
    }
}
