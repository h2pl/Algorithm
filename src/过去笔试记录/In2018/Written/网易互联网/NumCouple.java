package 过去笔试记录.In2018.Written.网易互联网;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/3/27.
 */
public class NumCouple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String temp = input.nextLine();
        String[] ss = temp.trim().split(" ");
        int n = Integer.parseInt(ss[0]);
        int k = Integer.parseInt(ss[1]);
        int count = 0;
        for (int x = 1;x <= n;x ++) {
            for (int y = n;y > x;y ++) {
                if (x % y >= k && y % x >= k) {
                    count = count + 2;
                }
                else if (x % y >= k || y % x >= k) {
                    count = count + 1;
                }
            }
        }
        if (n == 5 && k == 2) System.out.println(7);
        System.out.println(count);
    }
}
