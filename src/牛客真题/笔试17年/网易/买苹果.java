package 牛客真题.笔试17年.网易;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/24.
 */
public class 买苹果 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(bags(n));
    }
    public static int bags(int n) {
        if (n < 6)return -1;
        if (n == 7)return -1;
        int a = n / 8;
        int b = (n - a * 8)/ 6;
        if (a * 8 + b * 6 == n) return a + b;

        while (a >= 0 && b >= 0) {
            if (a * 8 + b * 6 > n) {
                a --;
            }else if (a * 8 + b * 6 < n){
                b ++;
            }else {
                return a + b;
            }
        }
        return -1;
    }
}
