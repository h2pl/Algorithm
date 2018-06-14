package 校招笔试.牛客模考;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/6/14.
 */
public class 牛牛数星星 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] star = new int[n][2];
        for (int i = 0;i < n;i ++) {
            star[i][0] = scanner.nextInt();
            star[i][1] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int [][]xy = new int[m][4];
        for (int i = 0;i < m;i ++) {
            xy[i][0] = scanner.nextInt();
            xy[i][1] = scanner.nextInt();
            xy[i][2] = scanner.nextInt();
            xy[i][3] = scanner.nextInt();
        }

        for (int i = 0;i < m;i ++) {
//            System.out.println(Arrays.toString(xy[i]));
            int x1 = xy[i][0];
            int y1 = xy[i][1];
            int x2 = xy[i][2];
            int y2 = xy[i][3];
            System.out.println(sum(star, x1, y1, x2, y2));
        }
    }

    public static int sum(int [][]star, int x1, int y1, int x2, int y2) {
        int cnt = 0;
        for (int []xy : star) {
            int x = xy[0];
            int y = xy[1];
            if ( x >= x1 && y >= y1 && x <= x2 && y <= y2 ) {
                cnt ++;
            }
        }
        return cnt;
    }
}
