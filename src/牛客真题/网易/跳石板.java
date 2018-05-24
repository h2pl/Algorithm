package 牛客真题.网易;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/24.
 */
public class 跳石板 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        System.out.println(minSteps(N, M));
    }

    //贪心
    public static int minSteps(int N, int M) {
        if (N == M) return 0;
        int cnt = 0;
        while (N < M) {
            for (int i = N/2;i > 1;i --) {
                if ((N / i) * i == N && N + i == M) {
                    cnt ++;
                    return cnt;
                }
            }
            for (int i = N/2;i > 1;i --) {
                if ((N / i) * i == N && N + i < M) {
                    cnt ++;
                    N = N + i;
                    break;
                }
            }
        }
        return -1;
    }
}
