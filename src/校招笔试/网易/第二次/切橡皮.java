package 校招笔试.网易.第二次;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/9/8.
 */
public class 切橡皮 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            cut(s);
        }

        public static void cut(String s) {
            int[] visit = new int[s.length()];
            int max = len(s);
            int flag = 0;
            StringBuilder sb = new StringBuilder();
            while (flag == 0) {
                if (s.charAt(0) == s.charAt(s.length() - 1)) {
                    flag = 1;
                }
                for (int i = 0; i < s.length() - 1; i++) {
//                flag = 1;
//                for (int j = 0;j < visit.length;j ++) {
//                    if (visit[j] == 0) {
//                        flag = 0;
//                    }
//                }
                    if (visit[i] == 0 && s.charAt(i) == s.charAt(i + 1)) {
                        sb = new StringBuilder();
                        sb.append(s.substring(0, i + 1)).reverse().append(s.substring(i + 1, s.length())).reverse();
                        max = Math.max(len(sb.toString()), max);
                        visit[i] = 1;
                        s = sb.toString();
                    }
                }
            }
            System.out.println(max);
        }

        public static int len(String s) {
            int max = 0;
            for (int i = 1; i < s.length(); ) {
                int cnt = 1;
                int j = i;
                if (s.charAt(j - 1) != s.charAt(j)) {
                    while (j < s.length() && s.charAt(j - 1) != s.charAt(j)) {
                        j++;
                        cnt++;
                    }
                    max = Math.max(cnt, max);
                    i = j + 1;
                } else {
                    i = j + 1;
                }
            }
            return max;
        }

}
