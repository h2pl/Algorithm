package 牛客真题.网易;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/21.
 */
public class 饥饿的小易 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        long x = Long.parseLong(line);

        System.out.println(min(x));
    }

    public static long min(long x) {
        //4x + 3和8x + 7可以拆成2x + 1;
        long count = 0;
        long goal = 1000000007;
        while (count <= 300000) {
            //防止溢出，每次都取余数
            x = ((x << 1) + 1) % goal;
            count ++;
            if (count == 1)continue;
            if (x == 0)break;
        }
        if (count > 300000) {
            return -1;
        }
        //这个式子的意思是,count = 2时，res = 1，count = 3时，res = 1.
        //以此类推是正确的可以把一个数拆成最小的2和3的组合个数。
        //虽然我也不知道为什么。count = 1时是不行的。
        long res = (count + 2)/3;
        if (res > 100000) {
            return -1;
        }else {
            return res;
        }
        //
    }
    //这个方法还是太慢了，请看正确解法
//    public static int min(long x) {
//        long a = (x << 2) + 3;
//        long b = (x << 3) + 7;
//        long goal = 1000000007;
//        int min = Integer.MAX_VALUE;
//        //i和j代表两种走法使用的次数，由于两种走法的地位相同，所以第一次符合要求的位置就是结果
//        long cnt = 0;
//        for(int i = 0;i <= 100000;i ++) {
//            for (int j = 0;j <= 100000 && i + j <= 100000 ;j ++) {
//                if (cnt > 300000) return -1;//这一句提高到了30%，避免复杂度太大不给分
//                cnt ++;
//                long way = i * a + j * b;
//                if (way % goal == 0 && way != 0) {
//                    return i + j;
//                }
//            }
//        }
//        return min;
//    }
}
