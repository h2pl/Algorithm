package In2018.Written.京东;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/4/9.
 */
public class 移除字符变成回文子串 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(remove(line));
        scanner.close();
    }
    public static int remove(String s) {
        int cnt = 0;
        for (int i = 1; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String a = s.substring(0, i);
                String b = s.substring(j, s.length());
                if (isHuiWen(a + b)) {
                    cnt++;
                }
                if (isHuiWen(a)) {
                    cnt++;
                }
                if (isHuiWen(b)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static boolean isHuiWen(String s) {
        if (s == null || s.equals(""))return false;
        if (s.length() == 1)return true;
        int l = 0,r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))return false;
            l ++;
            r --;
        }
        return true;
    }
}
