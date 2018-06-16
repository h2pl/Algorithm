package 牛客真题.笔试17年.网易;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/24.
 */
public class 优雅的数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(elegant(n));
    }
    public static int elegant(int n) {
        int cnt = 0;
        int r = (int) Math.pow(n, 0.5);
        for (int i = 1;i <= r;i ++) {
            int m = n - i * i;
            if (Math.pow(m, 0.5) == Math.ceil(Math.pow(m, 0.5))) {
                cnt ++;
            }
        }
        return cnt * 4;
    }
}
