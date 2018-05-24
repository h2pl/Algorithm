package In2018.Written.牛客模考;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/23.
 */
public class 取快递 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N,M,S,T;
        while (scanner.hasNextInt()) {
            N = scanner.nextInt();
            M = scanner.nextInt();
            S = scanner.nextInt();
            T = scanner.nextInt();
            int[][] road = new int[N + 1][N + 1];
            for (int i = 0; i < M; i++) {
                int U = scanner.nextInt();
                int V = scanner.nextInt();
                int D = scanner.nextInt();
                road[U][V] = D;
            }
            int[] min = new int[2];
            min[0] = Integer.MAX_VALUE;
            int[] goal = new int[1];
            goal[0] = T;
            dfs(0, S, road, S, goal, min);
            System.out.println(min[0] + " ");
        }
    }

    public static void dfs(int cnt, int cur, int[][] road, int S, int []T, int []min) {
        //标识到达终点min[1] = 1；
        if (cur == T[0] && min[1] == 0) {
            T[0] = S;
            min[1] = 1;
        }
        else if (cur == T[0] && min[1] == 1) {
            min[0] = Math.min(min[0], cnt);
            return;
        }
        for (int i = 1;i < road.length;i ++ ) {
            if (road[cur][i] != 0) {
                cnt += road[cur][i];
                dfs(cnt, i, road, S, T, min);
            }
        }
    }
}
