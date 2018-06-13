package 牛客真题.美团;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/6/13.
 */
public class 整数加法 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        if (!legal(a) || !legal(b)) {
            System.out.println("error");
        }else {
            System.out.println(add(a, b));
        }
    }

    public static String add(String a,String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int go = 0;

        String res = "";
        while (i >= 0 && j >= 0) {
            int a1 = Integer.parseInt(a.substring(i, i + 1));
            int b1 = Integer.parseInt(b.substring(j, j + 1));
            int sum = a1 + b1 + go;
            if (sum >= 10) {
                go = 1;
                sum = sum - 10;
            }else {
                go = 0;
            }
            res = sum + res;
            i --;
            j --;
        }

        String rem = i > j ? a.substring(0, i - j) : b.substring(0, j - i);

        if (go == 0) {
            res = rem + res;
        }

        int cur = rem.length() - 1;
        while (cur >= 0) {
            int num = Integer.parseInt(rem.substring(cur, cur + 1));
            int sum = num + go;
            if (sum >= 10) {
                sum = sum - 10;
                go = 1;
            } else {
                go = 0;
                break;
            }
            res = String.valueOf(sum) + res;
            cur --;
        }
        if (go == 1) {
            res = "1" + res;
        }
        return res;
    }
    public static boolean legal(String s) {
        for (int i = 0;i < s.length();i ++) {
            if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                continue;
            }else return false;
        }
        return true;
    }
}
