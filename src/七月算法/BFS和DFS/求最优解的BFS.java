package 七月算法.BFS和DFS;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by 周杰伦 on 2018/6/15.
 * 可以看到，每一层遍历的节点都与根节点距离相同。设 di 表示第 i 个节点与根节点的距离，推导出一个结论：对于先遍历的节点 i 与后遍历的节点 j，有 di<=dj。利用这个结论，可以求解最短路径等 最优解 问题：第一次遍历到目的节点，其所经过的路径为最短路径。应该注意的是，使用 BFS 只能求解无权图的最短路径。

 在程序实现 BFS 时需要考虑以下问题：

 队列：用来存储每一轮遍历得到的节点；
 标记：对于遍历过的节点，应该将它标记，防止重复遍历。
 */

//计算在网格中从原点到特定点的最短路径长度[[1,1,0,1],
// [1,0,1,0],
//         [1,1,1,1],
//         [1,0,1,1]]
public class 求最优解的BFS {

    public int minPathLength(int[][] grids, int tr, int tc) {
        final int[][] direction = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        final int m = grids.length, n = grids[0].length;
        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(0, 0));
        int pathLength = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            pathLength++;
            while (size-- > 0) {
                Pair<Integer, Integer> cur = queue.poll();
                for (int[] d : direction) {
                    int nr = cur.getKey() + d[0], nc = cur.getValue() + d[1];
                    Pair<Integer, Integer> next = new Pair<>(nr, nc);
                    if (next.getKey() < 0 || next.getValue() >= m
                            || next.getKey() < 0 || next.getValue() >= n) {

                        continue;
                    }
                    grids[next.getKey()][next.getValue()] = 0; // 标记
                    if (next.getKey() == tr && next.getValue() == tc) {
                        return pathLength;
                    }
                    queue.add(next);
                }
            }
        }
        return -1;
    }
}
