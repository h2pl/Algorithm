package 牛客真题.网易;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/20.
 */
public class 不要二 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String []s = line.split(" ");
        int W = Integer.parseInt(s[0]);
        int H = Integer.parseInt(s[1]);
        int [][]map = new int[W][H];
        int []cnt = new int[1];
        int []max = new int[1];
        dfs(map, cnt, max);
        System.out.println(max[0]);
    }
    public static void dfs(int [][]map, int[] cnt, int []max) {
       max[0] = Math.max(cnt[0], max[0]);
       for (int i = 0;i < map.length;i ++) {
           for (int j = 0;j < map[0].length;j ++) {
               if (map[i][j] == 0) {
                   map[i][j] = 1;
                   cnt[0] ++;
                   setFalse(map, i, j);
                   dfs(map, cnt, max);
                   map[i][j] = 0;
                   setTrue(map, i, j);
                   cnt[0] --;
               }
           }
       }
    }
    public static void setFalse(int[][]map, int x, int y) {
        if (x >= 2) {
            map[x - 2][y] = -1;
        }
        if (x < map.length - 2) {
            map[x + 2][y] = -1;
        }
        if (y >= 2) {
            map[x][y - 2] = -1;
        }
        if (y < map[0].length - 2) {
            map[x][y + 2] = -1;
        }
    }
    public static void setTrue(int[][]map, int x, int y) {
        if (x >= 2) {
            map[x - 2][y] = 0;
        }
        if (x < map.length - 2) {
            map[x + 2][y] = 0;
        }
        if (y >= 2) {
            map[x][y - 2] = 0;
        }
        if (y < map[0].length - 2) {
            map[x][y + 2] = 0;
        }
    }
    public static boolean legal(int x1, int y1, int x2, int y2) {
        int sum = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
        if (sum == 4)return false;
        else return true;
    }
}
