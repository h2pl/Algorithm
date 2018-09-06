package 校招笔试.英伟达;

/**
 * Created by 周杰伦 on 2018/9/4.
 */
import java.util.*;
public class BFS {
    static class Pos{
        int x;
        int y;
        int len;
        Pos(int x,int y,int len) {
            this.x = x;
            this.y = y;
            this.len = len;
        }
    }

    static int shortestDistance(int[][] map, int[] start, int[] dest) {
        Queue<Pos> queue = new LinkedList<>();
        int [][]visit = new int[map.length][map[0].length];
        queue.add(new Pos(start[0], start[1], 0));
        int [][]go = {{0,1},{0, -1},{-1,0},{1,0}};
        while (!queue.isEmpty()) {
            Pos pos = queue.poll();
            if (pos.x == dest[0] && pos.y == dest[1]) {
                return pos.len;
            }
            for (int [] road : go) {
                int x = pos.x + road[0];
                int y = pos.y + road[1];
                if (x >= 0 && x < map.length && y >= 0 && y < map[0].length && visit[x][y] == 0) {
                    queue.add(new Pos(x, y, pos.len + 1));
                    visit[x][y] = 1;
                }
            }
        }
        return -1;
    }

    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _map_rows = 0;
        int _map_cols = 0;
        _map_rows = Integer.parseInt(in.nextLine().trim());
        _map_cols = Integer.parseInt(in.nextLine().trim());

        int[][] _map = new int[_map_rows][_map_cols];
        for(int _map_i=0; _map_i<_map_rows; _map_i++) {
            for(int _map_j=0; _map_j<_map_cols; _map_j++) {
                _map[_map_i][_map_j] = in.nextInt();

            }
        }

        if(in.hasNextLine()) {
            in.nextLine();
        }

        int _start_size = 0;
        _start_size = Integer.parseInt(in.nextLine().trim());
        int[] _start = new int[_start_size];
        int _start_item;
        for(int _start_i = 0; _start_i < _start_size; _start_i++) {
            _start_item = Integer.parseInt(in.nextLine().trim());
            _start[_start_i] = _start_item;
        }

        int _dest_size = 0;
        _dest_size = Integer.parseInt(in.nextLine().trim());
        int[] _dest = new int[_dest_size];
        int _dest_item;
        for(int _dest_i = 0; _dest_i < _dest_size; _dest_i++) {
            _dest_item = Integer.parseInt(in.nextLine().trim());
            _dest[_dest_i] = _dest_item;
        }

        res = shortestDistance(_map, _start, _dest);
        System.out.println(String.valueOf(res));

    }
}
