package 牛客往年真题.笔试17年.京东;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/6/6.
 */
public class 进制均值 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.println(sumAndAve(n));
        }
    }

    public static String sumAndAve(int n) {
        int sum = 0;
        for (int i = 2;i < n;i ++) {
            sum += convert(n, i, 0);
        }
        int gcd = gcd(sum, n - 2);
        return sum/gcd + "/" + (n - 2)/gcd;
    }

//    // 2-16进制表示的位数
//    public String[] arr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
//            "A", "B", "C", "D", "E", "F"};

    /**
     * @param number 要转换的十进制数
     * @param system 转换的进制位
     */
    public static int convert(int number, int system, int sum) {
        sum = number % system + sum;

        if(number/system == 0) return sum;

        return convert(number/system, system, sum);
    }

    public static int gcd(int x, int y){ // 这个是运用辗转相除法求 两个数的 最大公约数  看不懂可以百度                                                        //    下
        if(y == 0)
            return x;
        else
            return gcd(y,x%y);
    }
}
