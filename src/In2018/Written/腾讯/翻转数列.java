package In2018.Written.腾讯;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/4/5.
 */
public class 翻转数列 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextInt()) {//注意while处理多个case
//            int a = in.nextInt();
//            int b = in.nextInt();
//            System.out.println(a + b);
//        }
//
//        in.close();
        reverse(8, 2);
    }
    public static void reverse(int n, int m) {
        int []num = new int[n + 1];
        int x = -1;
        num[1] = 1;
        int cnt = 0;
        for (int i = 1;i <= n ;i ++,cnt ++) {
                if (cnt < m) {
                    num[i] = i * x;
                }
                else {
                    x = x * -1;
                    cnt = 0;
                    num[i] = x * i;
                }
        }
        int sum = 0;
        for (int i = 1;i <= n;i ++) {
            sum += num[i];
        }
        System.out.println(sum);
    }

}
