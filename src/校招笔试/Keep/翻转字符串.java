package 校招笔试.Keep;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/9/3.
 */
public class 翻转字符串 {
    public static void main(String[] args) {
        System.out.println("3 1 4 1");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int k = scanner.nextInt();
        reverse(s, k);
    }
    public static void reverse(String str, int k) {
        StringBuilder sb = new StringBuilder();
        StringBuilder all = new StringBuilder();
        int time = 0;
        for (int i = 0;i <= str.length();i ++) {
            time = i / (3 * k);
            int begin = 3 * k * (time - 1);
            int end = begin + k;
            if ((str.length() - i >= 3 * k) && (i % (3 * k) == 0) && i != 0) {
                sb = new StringBuilder(str.substring(begin, end)).reverse();
                all.append(sb);
                all.append(str.substring(end, i));
            }else if (str.length() - i >= k && str.length() - i <= 3 * k) {
                all.append(new StringBuilder(str.substring(begin, end)).reverse());
                all.append(str.substring(end, str.length()));
            }else {
                all.append(new StringBuilder(str.substring(begin, end)).reverse());
            }
        }
        System.out.println(all.toString());
    }
}
