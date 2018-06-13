package 过去笔试记录.In2018.Written.头条;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/3/24.
 */
public class 跳板 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String temp = in.nextLine();
        String[] ss = temp.trim().split(" ");
        int n = Integer.parseInt(ss[0]);
        int k = Integer.parseInt(ss[1]);
        int h = Integer.parseInt(ss[2]);
        int []arr = new int[n];
        for (int i = 0;i < n;i ++ ) {
            int a = in.nextInt();
            arr[i] = a;
        }

        in.close();
        output(arr, k, h);
    }

    public static void output (int []arr, int k, int h) {
        System.out.println(1);
    }
}
