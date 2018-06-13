package 过去笔试记录.In2018.Written.网易互联网;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/3/27.
 */
public class 矩形覆盖个数 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int []x1 = new int[n];
        int []x2 = new int[n];
        int []y1 = new int[n];
        int []y2 = new int[n];
        String temp = input.nextLine();
        String[] ss = temp.trim().split(" ");
        for (int i = 0;i < n;i ++) {
            x1[i] = Integer.parseInt(ss[i]);
        }
        String temp1 = input.nextLine();
        String[] ss1 = temp1.trim().split(" ");
        for (int i = 0;i < n;i ++) {
            x2[i] = Integer.parseInt(ss1[i]);
        }
        String temp2 = input.nextLine();
        String[] ss2 = temp2.trim().split(" ");
        for (int i = 0;i < n;i ++) {
            y1[i] = Integer.parseInt(ss2[i]);
        }
        String temp3 = input.nextLine();
        String[] ss3 = temp3.trim().split(" ");
        for (int i = 0;i < n;i ++) {
            y2[i] = Integer.parseInt(ss3[i]);
        }
        int max = 1;
        for (int i = 0;i < n;i ++) {
            int a1 = x1[i];
            int b1 = x2[i];
            int c1 = y1[i];
            int d1 = y2[i];
            int count = 0;
            for (int j = 0;j < n;j ++) {
                int a2 = x1[j];
                int b2 = x2[j];
                int c2 = y1[j];
                int d2 = y2[j];
                if (chongdie(a1,b1,c1,d1,a2,b2,c2,d2)) {
                    count ++;
                }
            }
            if (count > max) max = count;
        }
        System.out.println(max);
        input.close();

    }

    public static boolean chongdie(int x1,int x2,int y1,int y2,
        int a1,int b1,int a2,int b2) {
        if (a2 > x1 && b2 > y1) return true;
        if (a2 > x1 && b1 < y2)return true;
        if (a1 < x2 && b1 < y2)return true;
        if (a1 < x2 && b2 > y1)return true;
        if (a1 > x1 && a2 > x2 && b1 > y1 && b2 < y2) return true;
        else return false;
    }
}
