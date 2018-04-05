package In2018.Written.腾讯;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/4/5.
 */
public class Q的歌单 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String temp = input.nextLine();
        String[] ss = temp.trim().split(" ");
        long k = Long.parseLong(ss[0]);
        String temp2 = input.nextLine();
        String[] ss2 = temp2.trim().split(" ");
        long a = Long.parseLong(ss2[0]);
        long b = Long.parseLong(ss2[1]);
        long x = Long.parseLong(ss2[2]);
        long y = Long.parseLong(ss2[3]);
        System.out.println(sum(k,a,b,x,y));
    }

    public static long sum (long k,long a,long b,long x,long y) {
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 1;i <= x;i ++) {
            for (int j = 1;j <= y;j ++) {
                if (a * i + b * j == k) {
                    int []tmp = new int[2];
                    tmp[0] = i;
                    tmp[1] = j;
                    if (!list.contains(tmp)) {
                        list.add(tmp);
                    }
                }
            }
        }
        long count = 0;
        for (int[] pair : list) {
            long needA = pair[0];
            long needB = pair[1];
            count += (jie(a)/jie(needA)*jie(a-needA)) * (jie(b)/jie(needB)*jie(b-needB));
        }
        return count;
    }
    public static double jie(long num) {
        long result =1l;
        for(long i=1;i<=num; i++) {
            result = result *i;
        }
        return result;
    }

}
