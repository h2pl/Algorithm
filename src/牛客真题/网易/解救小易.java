package 牛客真题.网易;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/21.
 */
public class 解救小易 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int n = Integer.parseInt(line);
        line = scanner.nextLine();
        String []s = line.split(" ");
        int [][] trap = new int[n][2];
        for (int i = 0;i < n;i ++) {
            trap[i][0] = Integer.parseInt(s[i]);
        }
        line = scanner.nextLine();
        s = line.split(" ");
        for (int i = 0;i < n;i ++) {
            trap[i][1] = Integer.parseInt(s[i]);
        }
        int min = min(trap);
        System.out.println(min);
    }

    public static int min(int[][] trap) {
        int min = Integer.MAX_VALUE;
        int minX = trap[0][0],minY = trap[0][1];
        int len = minX + minY - 2;
        for (int i = 0;i < trap.length;i ++) {
            int x = trap[i][0];
            int y = trap[i][1];
            len = x + y - 2;
            if (len < min) {
                min = len;
            }
        }
        return min;
    }
}
