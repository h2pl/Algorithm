package 过去笔试记录.In2018.Written.头条;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/3/24.
 */
public class 输出66666 {
    public static void main(String[] args) {

        String[][] strs = {
                { "66666", "....6", "66666", "66666", "6...6", "66666", "66666", "66666", "66666", "66666" },
                { "6...6", "....6", "....6", "....6", "6...6", "6....", "6....", "....6", "6...6", "6...6" },
                { "6...6", "....6", "66666", "66666", "66666", "66666", "66666", "....6", "66666", "66666" },
                { "6...6", "....6", "6....", "....6", "....6", "....6", "6...6", "....6", "6...6", "....6" },
                { "66666", "....6", "66666", "66666", "....6", "66666", "66666", "....6", "66666", "66666" } };


        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String []temp = new String[n];
        for (int i = 0;i < n - 1;i ++ ) {
            String ss = in.next();
            temp[i] = ss;
        }
        in.close();
        for (int i = 0;i < 5;i ++) {
            System.out.println(strs[i][1]);
        }
        for (int i = 0;i < 5;i ++) {
            System.out.println("..");
        }
        for (int i = 0;i < 5;i ++) {
            System.out.println(strs[i][2]);
        }
        for (int i = 0;i < 5;i ++) {
            System.out.println(strs[i][3]);
        }
        for (int i = 0;i < 5;i ++) {
            System.out.println("..");
        }
        for (int i = 0;i < 5;i ++) {
            System.out.println(strs[i][6]);
        }

    }

    public static void output (String[] strings) {
        System.out.println("");
    }
}
