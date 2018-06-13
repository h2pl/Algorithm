package 过去笔试记录.In2018.Written.招行信用卡;

import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Created by 周杰伦 on 2018/3/29.
 */
public class 整数乘积最大积 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] ss = str.trim().split(" ");
        int n = Integer.parseInt(ss[0]);
        System.out.println((int)max(n));
        sc.close();
    }
    public static double max (double n) {
        double Max,ThreeIndex,TwoIndex;
        if (n < 4)
        {
            if (n>2)
                return 2;
            return n == 2 ? 1 : 0;
        }
        if (n % 2 == 1)
        {
            TwoIndex = ((n - 3) % 6) / 2 ;
            ThreeIndex = (n - 3) / 6 * 2 + 1;
            Max = pow(3, ThreeIndex) * pow(2,TwoIndex);
        }
        else
        {
            TwoIndex = n % 6 / 2;
            ThreeIndex = n / 6 * 2;
            Max = pow(3, ThreeIndex)*pow(2, TwoIndex);
        }

        double x = Math.round(pow(n, 0.5));
        double max = 1;
        while (n - x> 1) {
            n = n - x;
            max = max * x;
            if (n - x == 0) {
                max = max * n;
            }
            else if (n - x > 0 && n - x <= 1) {
                double k = x - 1;
                while (n - k <= 1) {
                    k --;
                }
                max = max * k;
                max = max * (n - k);
            }else if (n - x < 0) {
                max = max * n;
            }

        }
        return Max;
    }

}
