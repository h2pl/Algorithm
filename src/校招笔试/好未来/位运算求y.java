package 校招笔试.好未来;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/8/28.
 */
public class 位运算求y {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            long[][] arr = new long[t][2];
            for (int i = 0; i < t; i++) {
                long x = scanner.nextLong();
                long k = scanner.nextLong();
                arr[i][0] = x;
                arr[i][1] = k;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(getY(arr[i][0], arr[i][1]));
            }
        }

        public static long getY(long x, long k) {
            int cnt = 0;
            long max = Long.MAX_VALUE;
            for (long i = 1; i < max; i++) {
                if (i + x == (i | x)) {
                    cnt++;
                    if (cnt == k) {
                        return i;
                    }
                }
            }
            return 0;
        }

}
