package 校招笔试.京东;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/9/9.
 */
public class 修路 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][]map = new int[n][n];
        for (int i = 0;i < n;i ++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            map[a][b] = 1;
            map[b][a] = 1;
        }
        road(map);
    }
    static int max = 0;
    public static void road(int [][]map) {

    }
    public static void dfs(int [][]map, int[]visit, int cur, int a, int b) {
        if (cur >= visit.length) {
            return;
        }
        max = Math.max(max, a * b);
        if (visit[cur] == 0) {
            visit[cur] = 1;
            for (int i = 1;i <= visit.length;i ++) {

            }
        }
    }
}
