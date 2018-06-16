package 牛客真题.笔试17年.网易;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/19.
 */
public class 星际穿越 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        long h = Long.parseLong(line);
        System.out.println(max(h));
    }
    public static long max(long h) {
        for (long i = (long) Math.pow(h, 0.5); i >= 1; i --) {
            if (i * (i + 1) <= h) {
                return i;
            }
        }
        return 0;
    }
}
