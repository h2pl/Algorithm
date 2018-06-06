package 牛客真题.腾讯;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/6/5.
 */
public class 素数对 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(couple(a));
    }
    public static int couple(int a) {
        int []arr = new int[1000];
        arr[2] = 1;
        for (int i = 3;i < a;i ++) {
            boolean flag = true;
            for (int j = 2; j < i && j <= 31; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arr[i] = 1;
            }
        }

        int res = 0;
        for (int i = 2;i <= a/2;i ++) {
            if (arr[i] == 1 && arr[a - i] == 1) {
                res ++;
            }
        }
        return res;
    }
}
