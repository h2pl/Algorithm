package 牛客真题.笔试17年.滴滴;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/27.
 */
//回溯，即需要标记访问的dfs
public class 地下迷宫 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int P = scanner.nextInt();
        int [][]map = new int[n][m];
        for (int i = 0;i < n;i ++) {
            for (int j = 0;j < m;j ++) {
                map[i][j] = scanner.nextInt();
            }
        }
        List <int []> list = new ArrayList<>();
        List <int []> minList = new ArrayList<>();
        int [][]visit = new int[n][m];
        visit[0][0] = 1;
        int []max = new int[2];
        max[0] = Integer.MIN_VALUE;
        max[1] = 0;
        list.add(new int[]{0, 0});
        dfs(map, 0, 0, P, visit, list, minList, max);

        if (max[1] == 0) {
            System.out.print("Can not escape!");
        }

        else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < minList.size(); i++) {
                if (i == minList.size() - 1) {
                    sb.append("[" + minList.get(i)[0] + "," + minList.get(i)[1] + "]");
                } else {
                    sb.append("[" + minList.get(i)[0] + "," + minList.get(i)[1] + "]" + ",");
                }
            }
            System.out.println(sb.toString());
        }
    }

    public static void dfs(int [][]map, int x, int y, int rem, int [][]visit, List<int []> road, List<int []> minRoad, int[] max) {
        if (x == 0 && y == map[0].length - 1 && rem >= 0) {
            max[1] = 1;
            if (rem > max[0]) {
                max[0] = rem;
                minRoad.clear();
                minRoad.addAll(road);
                return;
            }else {
                return;
            }
        }
        if (rem <= 0) {
            return;
        }



        int [][]way = new int[4][3];
        way[0][0] = 1;
        way[0][1] = 0;
        way[0][2] = 3;

        way[1][0] = -1;
        way[1][1] = 0;
        way[1][2] = 0;

        way[2][0] = 0;
        way[2][1] = 1;
        way[2][2] = 1;

        way[3][0] = 0;
        way[3][1] = -1;
        way[3][2] = 1;

        for (int i = 0;i < way.length;i ++) {
            int x1 = x + way[i][0];
            int y1 = y + way[i][1];
            if (x1 >= map.length || x1 < 0 || y1 >= map[0].length || y1 < 0) {
                continue;
            }
            if (map[x1][y1] == 1 && visit[x1][y1] != 1) {
                visit[x1][y1] = 1;
                road.add(new int[]{x1, y1});
                dfs(map, x1, y1, rem - way[i][2], visit, road, minRoad, max);
                road.remove(road.size() - 1);
                visit[x1][y1] = 0;
            }
        }
    }
}
