package In2017.exam3;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2017/4/11.
 * 有一个整数n，将n分解成若干个不同自然数之和，问如何分解能使这些数的乘积最大，输出这个乘积m
 */
public class MaxMulti {
    public static void main(String []args) {

        Scanner input = new Scanner(System.in);
        String temp = input.nextLine();
        String[] ss = temp.trim().split(" ");
        int n = Integer.parseInt(ss[0]);


        //存放因子的数组
        int []num= new int[n];
        int i = 0;
        int max=1;

        for (int j = 2; j <= n; j++) {
            num[i++] = j;
            n -= j;
        }

        //从后往前依次加1
        for (int j = 0; j < n; j++) {
            num[i-j-1]++;
        }
        for (int j = 0; j < i; j++) {
                max *= num[j];
            }
        System.out.println(max);
    }
}
