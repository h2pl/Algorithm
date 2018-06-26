package 牛客往年真题.笔试16年.美团;

/**
 * Created by 周杰伦 on 2018/6/26.
 */
public class 拜访 {
    public static void main(String[] args) {
        int [][]map = {{0,1,0},{2,0,0}};
        countPath(map, 2, 3);
        System.out.println(count);
    }
    static int count = 0;
    public static int countPath(int[][] map, int n, int m) {
        count = 0;
        // write code here
        int x1 = 0,y1 = 0,x2 = 0,y2 = 0;
        int [][]visit = new int[n][m];
        for (int i = 0;i < n;i ++) {
            for (int j = 0;j < m;j ++) {
                if (map[i][j] == 1) {
                    x1 = i;
                    y1 = j;
                }
                if (map[i][j] == 2) {
                    x2 = i;
                    y2 = j;
                }
            }
        }
        int [][]pos = new int[2][2];
        if (x1 <= x2) {
            pos[0][0] = 1;
            pos[0][1] = 0;
        }else {
            pos[0][0] = -1;
            pos[0][1] = 0;
        }
        if (y1 <= y2) {
            pos[1][0] = 0;
            pos[1][1] = 1;
        }else {
            pos[1][0] = 0;
            pos[1][1] = -1;
        }
        dfs(map, x1, y1, visit, pos);
        return count;
    }
    public static void dfs(int[][] map, int row, int col, int [][]visit, int [][]pos) {

        if (map[row][col] == 2) {
            count ++;
            return;
        }

        for (int i = 0;i < pos.length;i ++) {
            int x = row + pos[i][0];
            int y = col + pos[i][1];
            if (x >= map.length || x < 0 || y >= map[0].length || y < 0)
                continue;
            if (map[x][y] != -1 && visit[x][y] == 0) {
                visit[x][y] = 1;
                dfs(map, x, y, visit, pos);
                visit[x][y] = 0;
            }
        }
    }
}
