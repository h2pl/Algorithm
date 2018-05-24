package 牛客真题.网易;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/24.
 */
public class 最大的奇数约数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        System.out.println(maxOdd(N));
    }

    public static long maxOdd (long N) {
        long sum = 0;
        for (int i = 1;i <= N;i ++) {
            if (i % 2 != 0) {
                sum += i;
            }else {
                int temp = i;
                while (temp >= 2 && temp % 2 == 0) {
                    temp = temp / 2;
                }
                sum += temp;
            }
        }
        return sum;
    }

}
