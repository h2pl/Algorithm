package Format;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2017/3/29.
 */
public class input {
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

    public static void 输入一个数n和一个大小为n的数组(String[] args) {
        Scanner input = new Scanner(System.in);
        String temp = input.nextLine();
        String[] ss = temp.trim().split(" ");
        int n = Integer.parseInt(ss[0]);
        String temp2 = input.nextLine();
        String[] ss2 = temp2.trim().split(" ");

        int []num=new int[n];
        for(int i=0;i<ss2.length;i++){
            num[i]=Integer.parseInt(ss2[i]);
        }
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
