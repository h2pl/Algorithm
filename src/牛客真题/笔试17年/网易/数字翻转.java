package 牛客真题.笔试17年.网易;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/24.
 */
public class 数字翻转 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(rev(rev(x) + rev(y)));
    }

    public static int rev(int n) {
        if (n == 0)return 0;
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        for (int i = 0;i < sb.length();i ++) {
            if (sb.charAt(i) == '0') {
                sb.deleteCharAt(i);
            }else break;
        }
        return Integer.valueOf(sb.toString());
    }
}
