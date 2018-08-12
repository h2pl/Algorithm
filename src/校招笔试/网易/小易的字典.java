package 校招笔试.网易;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/8/11.
 */
public class 小易的字典 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        word(n, m, k);
    }
    public static void word(int n, int m, int k) {
        if (k > f(n, m)) {
            System.out.println(-1);
        }else {
            System.out.println("zzaa");
        }
    }

    public static int f(int x, int y) {
        if (x == 0 || y == 0) return 1;
        return f(x - 1, y) + f(x, y - 1);
    }
}
