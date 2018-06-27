package 牛客往年真题.笔试17年.网易;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/24.
 */
public class 暗黑字符串 {
    //如何去重
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sum(n));
    }
    public static int sum(int n) {
        if (n == 1)return 3;
        if (n == 2)return 9;
        if (n == 3)return 21;
        int index = n - 2;
        return (int) (Math.pow(3,n) - index * 6 * Math.pow(3, n - 3)) ;
    }
}
