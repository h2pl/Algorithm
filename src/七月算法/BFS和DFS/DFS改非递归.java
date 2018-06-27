package 七月算法.BFS和DFS;

import java.util.Stack;

/**
 * Created by 周杰伦 on 2018/6/21.
 */
public class DFS改非递归 {

    /**
     * 图的DFS 非递归遍历算法
     * @author Administrator
     *
     */
    class DFS
    {
        private char[] vertices;        //存储顶点信息
        private int[][] arcs;           //存储边
        private boolean[] visited;      //顶点是否访问过
        private int vexnum;             //顶点个娄

        /**
         * 实例对象时需要传入的顶点的个数
         * @param n
         */
        public DFS(int n)
        {
            vexnum = n;

            vertices = new char[n];

            arcs = new int[n][n];

            visited = new boolean[n];
        }

        /**
         * 在顶点之间添加一条边
         * @param i
         * @param j
         */
        public void AddEdge(int i, int j)
        {
            if(i == j) return;

            arcs[i][j] = 1;
            arcs[j][i] = 1;
        }

        /**
         * 设置顶点的值
         * @param vertices
         */
        public void SetVertices(char[] vertices)
        {
            this.vertices = vertices;
        }

        /**
         * 访问第i个顶点元素
         * @param i
         */
        private void visit(int i)
        {
            System.out.print(" "+this.vertices[i]);
        }

        /**
         * 非递归实现
         */
        public void DFSByStack()
        {
            //初始化访问矩阵
            for(int i = 0; i<vexnum;i++)
            {
                visited[i] = false;
            }

            Stack<Integer> stack = new Stack<Integer>();

            stack.push(0);          //将第0个元素压入栈
            visited[0] = true;      //第0个元素已经访问
            visit(0);

            while(!stack.empty())
            {
                int k = stack.peek().intValue();        //访问栈顶元素但不出栈
                boolean needPop = true;

                for(int i=0;i<vexnum; i++)
                {
                    if(arcs[k][i] == 1 && visited[i] == false)
                    {
                        stack.push(i);          //将第i个元素压入栈
                        visited[i] = true;      //第i个元素已经访问
                        visit(i);
                        needPop = false;

                        break;
                    }

                }

                if(needPop)
                {
                    stack.pop();
                }
            }
        }
    }
}

