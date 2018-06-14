package 校招笔试.牛客模考;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/6/14.
 */
public class 牛牛游玩记 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char [][]map = new char[n][n];

        for (int i = 0;i < n;i ++) {
            String line = scanner.nextLine();
            for (int j = 0;j < line.length();j ++) {
                map[i][j] = line.charAt(j);
            }
        }
//        for (int i = 0;i < n;i ++) {
//            System.out.println(Arrays.toString(map[i]));
//        }
        System.out.println(go(map));
    }

    public static int go(char [][]map) {
        int min = Integer.MAX_VALUE;
        for (int i = 0;i < map.length;i ++) {
            for (int j = 0;j < map[0].length;j ++) {
                char c = map[i][j];
                if (c == '@') {
                    min = bfs(map, i, j, 0);
                }
            }
        }
        return min;
    }

    public static int bfs(char [][]map, int x, int y, int step) {
        int [][]visit = new int[map.length][map[0].length];
        int [][]way = {{0,1},{0,-1},{1,0},{-1,0}};

        Node node = new Node(x, y, step);
        Queue<Node> queue = new LinkedList();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node p = queue.poll();
            if (map[p.x][p.y] == '*') {
                return p.step;
            }
            for (int i = 0;i < 4;i ++) {
                int x1 = p.x + way[i][0];
                int y1 = p.y + way[i][1];
                if (x1 < map.length && x1 >= 0 && y1 < map[0].length && y1 >= 0 && map[x1][y1] != '#' && visit[x1][y1] == 0 ) {
                    queue.add(new Node(x1, y1, p.step + 1));
                    visit[x1][y1] = 1;
                    System.out.println(map[x1][y1]);
                }
            }
        }
        return step;
    }

    static class Node{
        public Node(int x, int y, int step) {
            this.x = x;
            this.y = y;
            this.step = step;
        }

        int x;
        int y;
        int step;
    }
//
//    public static int bfs(char [][]map, int x, int y, int step, int[][]visit) {
//
//        if (map[x][y] == '*') {
//            return step;
//        }
//
//        if (x >= map.length || x < 0 || y >= map[0].length || y < 0) {
//
//        }
//
//        int [][]way = {{0,1},{0,-1},{1,0},{-1,0}};
//        for (int i = 0;i <way.length;i ++) {
//            int xo = x + way[0][0];
//            int yo = y + way[0][1];
//            if (xo >= map.length || xo < 0 || yo >= map[0].length || yo < 0 || map[xo][yo] == '#') {
//                continue;
//            }
//        }
//        bfs(map, x + 1, y,  1);
//        bfs(map, x - 1, y,  1);
//        bfs(map,  x, y + 1,  1);
//        bfs(map, x, y - 1,  1);
//
//        return -1;
//    }
}
