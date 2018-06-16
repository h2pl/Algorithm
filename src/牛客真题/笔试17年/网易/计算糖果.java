package 牛客真题.笔试17年.网易;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/24.
 */
public class 计算糖果 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int P = scanner.nextInt();
        int Q = scanner.nextInt();
        if (M - P + N + Q != 0) {
            System.out.println("No");
        }else {
            int A = P - (N + Q) / 2;
            int B = (N + Q) / 2;
            int C = (Q - N) / 2;
            System.out.println(A + " " + B + " " + C);
        }
    }
}
