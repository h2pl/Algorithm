package 过去笔试记录.In2018.Written.牛客模考;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/23.
 * 小牛牛为了向他的父母表现他已经长大独立了,他决定搬出去自己居住一段时间。

 一个人生活增加了许多花费: 牛牛每天必须吃一个水果并且需要每天支付x元的房屋租金。

 当前牛牛手中已经有f个水果和d元钱,牛牛也能去商店购买一些水果,商店每个水果售卖p元。

 牛牛为了表现他独立生活的能力,希望能独立生活的时间越长越好,牛牛希望你来帮他计算一下他最多能独立生活多少天。

 输入描述:
 输入包括一行,四个整数x, f, d, p(1 <= x,f,d,p <= 2 * 10^9),以空格分割
 输出描述:
 输出一个整数, 表示牛牛最多能独立生活多少天。
 示例1
 输入
 3 5 100 10
 输出
 11
 */
public class 生活费 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String []s = line.split(" ");
        long x,f,d,p;
        x = Long.parseLong(s[0]);
        f = Long.parseLong(s[1]);
        d = Long.parseLong(s[2]);
        p = Long.parseLong(s[3]);
        long day = livedays(x, f, d, p);
        System.out.println(livedays(x, f, d, p));
    }

    public static long livedays(long x, long f, long d, long p) {
        if (d < x ) return 0;
        //天数
        long n = d / x;
        //购买水果数
        if (f >= n) {
            return n;
        }else {
            n = (f * p + d)/(p + x);
            return n;
        }
    }
}
