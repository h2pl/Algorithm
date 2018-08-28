package 校招笔试.好未来;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/8/28.
 */
public class 三三三 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        divide(s);
    }

    static int max = 0;

    public static void divide(String s) {
        max = 0;
        dfs(s, 0, 0);
        System.out.println(max);
    }

    public static void dfs(String s, int cur, int cnt) {
        if (cur >= s.length()) {
            max = Math.max(cnt, max);
            return;
        }
        for (int i = cur + 1; i <= s.length(); i++) {
            if (sum(s.substring(cur, i)) % 3 == 0) {
                dfs(s, i, cnt + 1);
            }else {
                dfs(s, i, cnt);
            }
        }
    }

    public static int sum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(s.substring(i, i + 1));
        }
        return sum;
    }
}
