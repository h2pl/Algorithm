package 过去笔试记录.In2018.Written.头条;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/3/24.
 */
public class magic次数 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String temp = in.nextLine();
        String[] ss = temp.trim().split(" ");
        int n = Integer.parseInt(ss[0]);
        int m = Integer.parseInt(ss[1]);
        int []arr1 = new int[n];
        int []arr2 = new int[m];
        String temp1 = in.nextLine();
        String[] ss1 = temp1.trim().split(" ");
        for (int i = 0;i < n;i ++ ) {
            int a = Integer.parseInt(ss1[i]);
            arr1[i] = a;
        }
        String temp2 = in.nextLine();
        String[] ss2 = temp2.trim().split(" ");
        for (int i = 0;i < m;i ++ ) {
            int a = Integer.parseInt(ss2[i]);
            arr2[i] = a;
        }
        in.close();


        output(arr1, arr2);
    }

    public static void output (int []arr1, int []arr2) {
        System.out.println("");
    }
}
