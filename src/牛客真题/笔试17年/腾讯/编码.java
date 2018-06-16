package 牛客真题.笔试17年.腾讯;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/6/5.
 */
public class 编码 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(encode(str));
    }
    public static int encode(String str) {
        if (str.equals("a")) {
            return 0;
        }
        if (str.equals("aa")) {
            return 1;
        }
        if (str.equals("aaa")) {
            return 2;
        }
        if (str.equals("aaaa")) {
            return 3;
        }

        int res = 0;
        int one,two,three,four;
        int mod = 25;
        one = mod * mod * mod + mod * mod + mod + 1;
        two = mod * mod + mod + 1;
        three = mod + 1;
        four = 1;
        int []arr = new int[4];
        arr[0] = one;
        arr[1] = two;
        arr[2] = three;
        arr[3] = four;

        int i = 1;
        while (i <= str.length()) {
            int cnt = Integer.parseInt(String.valueOf(str.charAt(i - 1) - 'a'));
            if (i == 1) {
                res += cnt * arr[i - 1];
            }else {
                //此处加一是因为，a = 0,aa = 1，所以除了第一位每一位都要加1
                res += cnt * arr[i - 1] + 1;
            }
            i ++;
        }
        return res;
    }
}
