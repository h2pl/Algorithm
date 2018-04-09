package Format;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2017/3/29.
 */
public class 输入数组或多个数 {
    public static void 输入两个数(String[] args) {
        Scanner input = new Scanner(System.in);
        String temp = input.nextLine();
        String[] ss = temp.trim().split(" ");

        int N = Integer.parseInt(ss[0]);
        int M = Integer.parseInt(ss[1]);

        int[] Ti = new int[N];
        int[] Qi = new int[M];
        input.close();
    }

    public static void 输入一个数组(){
        Scanner input = new Scanner(System.in);
        String temp = input.nextLine();
        String[] ss = temp.trim().split(" ");
        int []num=new int[ss.length];
        for(int i=0;i<num.length;i++){
            num[i]=Integer.parseInt(ss[i]);
        }
    }
}
