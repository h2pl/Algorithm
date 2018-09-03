package 校招笔试.拼多多.第二波;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/8/30.
 */
public class 竖着的棋盘 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            char[][] map = new char[a][b];
            char[][] res = new char[a][b];
            for (int i = 0; i < a; i++) {
                String str = sc.next();
                for (int j = 0; j < b; j++) {
                    map[i][j] = str.charAt(j);
                }
            }
            int lastX = -1;
            for (int j = 0; j < b; j++) {
                lastX = -1;
                for (int i = a - 1; i >= 0; i--) {
                    if (map[i][j] == '.') {
                        res[i][j] = '.';
                    } else if (map[i][j] == 'o') {
                        if (lastX > 0) {
                            res[--lastX][j] = 'o';
                            if (lastX != i) {
                                res[i][j] = '.';
                            }
                        } else {
                            res[i][j] = '.';
                        }
                    } else {
                        lastX = i;
                        res[i][j] = 'x';
                    }
                }
            }
            // 输出
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print(res[i][j]);
                }
                System.out.println();
            }
        }
    }
}


