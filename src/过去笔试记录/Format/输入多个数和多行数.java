package 过去笔试记录.Format;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/4/5.
 */
public class 输入多个数和多行数 {
    public static void main(String[] args) {

    }
    public static void 输入两个数n和k_n个数组大小为k(String[] args) {
        Scanner input = new Scanner(System.in);
        String temp = input.nextLine();
        String[] ss = temp.trim().split(" ");
        int n = Integer.parseInt(ss[0]);
        int k = Integer.parseInt(ss[1]);
        int a[][] = new int[n][k];
        for(int i = 0;i < n;i ++){
            String temp1 = input.nextLine();
            String[] ss2 = temp.trim().split(" ");
            for (int j = 0;j < k;j ++) {
                a[i][j] = Integer.parseInt(ss2[j]);
            }
        }

        input.close();
    }
}
