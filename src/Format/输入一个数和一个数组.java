package Format;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/4/5.
 */
public class 输入一个数和一个数组 {
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
}
