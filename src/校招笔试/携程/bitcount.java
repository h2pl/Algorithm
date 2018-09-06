package 校招笔试.携程;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/9/4.
 */
public class bitcount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        count(num);
    }
    public static void count(long num) {
        System.out.println(Long.bitCount(num));
    }
}
