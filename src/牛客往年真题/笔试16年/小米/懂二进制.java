package 牛客往年真题.笔试16年.小米;

/**
 * Created by 周杰伦 on 2018/6/15.
 */
public class 懂二进制 {
    public static void main(String[] args) {
        System.out.println(countBitDiff(1999, 2299));
    }
    /**
     * 获得两个整形二进制表达位数不同的数量
     *
     * @param m 整数m
     * @param n 整数n
     * @return 整型
     */
    public static int countBitDiff(int m, int n) {
        int res = m ^ n;
        return Integer.bitCount(res);
    }
}
