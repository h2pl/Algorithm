package 牛客真题.笔试17年.滴滴;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/27.
 */
public class 末尾0的个数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        for (int i = 1;i <= n;i ++) {
            int temp = i;
            while (temp % 5 == 0) {
                temp = temp/5;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
