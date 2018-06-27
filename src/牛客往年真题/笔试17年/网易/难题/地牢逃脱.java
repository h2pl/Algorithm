package 牛客往年真题.笔试17年.网易.难题;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/18.
 */
//题意不好理解
public class 地牢逃脱 {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        String line = scanner.nextLine();
        String []s = line.split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        char [][]map = new char[n][m];

        //读取一个map
        for (int i = 0;i < n;i ++) {
            line = scanner.nextLine();
            for (int j = 0;j < m;j ++) {
                map[i][j] = line.charAt(0);
            }
        }
        //初始位置
        line = scanner.nextLine();
        s = line.split(" ");
        int xo = Integer.parseInt(s[0]);
        int yo = Integer.parseInt(s[1]);

        //步数和具体走法
        line = scanner.nextLine();
        int step = Integer.parseInt(line);
        int [][]move = new int[step][2];
        for (int i = 0;i < step;i ++) {
            line = scanner.nextLine();
            s = line.split(" ");
            move[i][0] = Integer.parseInt(s[0]);
            move[i][1] = Integer.parseInt(s[1]);
        }
        int [][]visit = new int[n][m];
        int []min = new int[1];
        min[0] = -1;
        int max = -1;
        //找四条边上的点，作为出口，分别求其最小需要的步数
        for (int i = 0;i < n;i ++) {
            dfs(map, move, 0, xo, yo, visit, min, i, 0);
            //在这些步数中找出最大值，就是题目要求的最大步数
            max = Math.max(max, min[0]);
        }
        min[0] = -1;
        for (int i = 0;i < n;i ++) {
            dfs(map, move, 0, xo, yo, visit, min, i, map[0].length - 1);
            max = Math.max(max, min[0]);
        }
        min[0] = -1;
        for (int i = 0;i < m;i ++) {
            dfs(map, move, 0, xo, yo, visit, min, 0, i);
            max = Math.max(max, min[0]);
        }
        min[0] = -1;
        for (int i = 0;i < m;i ++) {
            dfs(map, move, 0, xo, yo, visit, min, map[0].length - 1, i);
            max = Math.max(max, min[0]);
        }
        System.out.println(max);
    }

    public static void dfs(char [][]map, int [][]move, int step, int x, int y, int [][] visit, int []min,int xx, int yy) {
        if (x == xx && y == yy) {
            if (min[0] == -1) {
                min[0] = step;
            }else {
                min[0] = Math.min(min[0], step);
            }
        }

        visit[x][y] = 1;

        for (int i = 0;i < move.length;i ++) {
            int x1 = x + move[i][0];
            int y1 = y + move[i][1];
            if (x1 < map.length && x1 >= 0 && y1 < map[0].length && y1 >= 0) {
                if (map[x1][y1] == '.' && visit[x1][y1] == 0) {
                    dfs(map, move, step + 1, x1, y1, visit, min, xx, yy);
                    visit[x1][y1] = 0;
                }
            }
        }
        return;
    }
}
