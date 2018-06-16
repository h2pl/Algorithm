package 牛客真题.笔试17年.京东;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/6/6.
 */
public class 幸运数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(lucky(n));
    }
    public static int lucky(int n) {
        int cnt = 0;
        for (int i = 1 ;i <= n;i ++) {
            String s = String.valueOf(i);
            int sum = 0;
            for (int j = 0;j < s.length();j ++) {
                sum += Integer.parseInt(s.substring(j,j + 1));
            }
            int bitcnt = Integer.bitCount(i);
            if (sum == bitcnt) {
                cnt ++;
            }
        }
        return cnt;
    }
}
