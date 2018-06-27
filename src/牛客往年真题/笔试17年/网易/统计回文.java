package 牛客往年真题.笔试17年.网易;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/21.
 */
public class 统计回文 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println(insert(a, b));
    }

    public static int insert(String a, String b) {
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i <= a.length();i ++) {
            if (i == 0) {

            }else {
                sb.append(a.substring(0, i));
            }
            sb.append(b);
            if (i == a.length()) {

            }else {
                sb.append(a.substring(i, a.length()));
            }
            if (legal(sb.toString())) {
                cnt ++;
            }
            sb = new StringBuilder();
        }
        return cnt;
    }

    public static boolean legal(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i ++;
            j --;
        }
        return true;
    }
}
