package 牛客真题.网易;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/19.
 */
public class 藏宝图 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println(sub(s1, s2));
    }

    public static String sub(String s1, String s2) {
        int i = 0,j = 0;
        int start = 0;
        while (start < s1.length()) {
            //s1从第start个元素开始找s2。因为子串可能从任意位置开始匹配
            j = start;
            i = 0;
            //开始匹配
            while (i < s2.length() && j < s1.length()) {
                if (s1.charAt(j) == s2.charAt(i)) {
                    i++;
                    j++;
                } else {
                    j++;
                }
            }
            start ++;
            if (i == s2.length()) {
                return "Yes";
            }
        }
        return "No";
    }
}
