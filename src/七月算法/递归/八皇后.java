package 七月算法.递归;

import java.util.Arrays;

/**
 * Created by 周杰伦 on 2018/5/30.
 */
public class 八皇后 {
    public static void main(String[] args) {
        eightQueen();
    }
    public static void eightQueen() {
        //八皇后用回溯法
        int [][]arr = new int[8][8];
        int [][]visit = new int[8][8];
        int []cnt = new int[1];
        recursive(arr, 0, visit, cnt);
        System.out.println(cnt[0]);
    }
    public static void recursive(int [][]arr, int row, int[][]visit, int[]cnt) {

        if (row == 8){
            cnt[0] ++;
//            for (int i = 0;i < 8;i ++) {
//                System.out.println(Arrays.toString(arr[i]));
//            }
//            System.out.println("----------------------------------");
            return;
        }

        for (int i = 0;i < 8;i ++) {
            if (visit[row][i] == 0) {

                arr[row][i] = 1;
                visit[row][i] = 1;
                visit(visit, row, i);

                recursive(arr, row + 1, visit, cnt);

                arr[row][i] = 0;
                visit[row][i] = 0;
                devisit(visit, row, i);

            }
        }
    }
    public static void devisit(int [][]visit, int x, int y) {
        for (int i = 0;i < 8;i ++) {
            if (i == y)continue;
            visit[x][i] = 0;
        }
        for (int i = 0;i < 8;i ++) {
            if (i == x)continue;
            visit[i][y] = 0;
        }
        //四个斜方向
        int i = x + 1,j = y - 1;
        while (i < 8 && j >= 0 ) {
            visit[i][j] = 0;
            i ++;
            j --;
        }
        i = x - 1;
        j = y + 1;
        while (j < 8 && i >= 0 ) {
            visit[i][j] = 0;
            i --;
            j ++;
        }
        i = x + 1;
        j = y + 1;
        while (i < 8 && j < 8 ) {
            visit[i][j] = 0;
            i ++;
            j ++;
        }
        i = x - 1;
        j = y - 1;
        while (j >= 0 && i >= 0 ) {
            visit[i][j] = 0;
            i --;
            j --;
        }
    }
    public static void visit(int [][]visit, int x, int y) {
        for (int i = 0;i < 8;i ++) {
            if (i == y)continue;
            visit[x][i] = -1;
        }
        for (int i = 0;i < 8;i ++) {
            if (i == x)continue;
            visit[i][y] = -1;
        }
        //四个斜方向
        int i = x + 1,j = y - 1;
        while (i < 8 && j >= 0 ) {
            visit[i][j] = -1;
            i ++;
            j --;
        }
        i = x - 1;
        j = y + 1;
        while (j < 8 && i >= 0 ) {
            visit[i][j] = -1;
            i --;
            j ++;
        }
        i = x + 1;
        j = y + 1;
        while (i < 8 && j < 8 ) {
            visit[i][j] = -1;
            i ++;
            j ++;
        }
        i = x - 1;
        j = y - 1;
        while (j >= 0 && i >= 0 ) {
            visit[i][j] = -1;
            i --;
            j --;
        }
    }
}
