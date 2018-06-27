package 牛客往年真题.笔试17年.滴滴;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/27.
 */
public class 餐馆 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int []a = new int[n];
        int [][] bc = new int[m][2];
        for (int i = 0;i < n;i ++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0;i < m;i ++) {
            bc[i][0] = scanner.nextInt();
            bc[i][1] = scanner.nextInt();
        }
        System.out.println(max(a, bc));
    }

    //贪心
    public static long max(int []a, int [][] bc) {
        Comparator comparator = new Comparator<int []>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        };
        Arrays.sort(bc, comparator);
//        for (int i = 0;i < bc.length;i ++) {
//            System.out.println(Arrays.toString(bc[i]));
//        }
        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));
        int i = 0,j = 0;
        long sum = 0;
        int []used = new int[a.length];

        //如果客人都坐好了，则结束循环
        while (i < a.length && j < bc.length) {
            if (a[i] >= bc[j][0] && used[i] == 0) {
                sum += bc[j][1];
                used[i] = 1;
                j ++;
                i = 0;
            }else if (a[i] < bc[j][0] || used[i] != 0){
                i ++;
            }
            //如果还没坐满，那么再次去匹配
            if (i == a.length && !usedup(used)) {
                i = 0;
                j ++;
            }
        }
        return sum;
    }

    public static boolean usedup(int []used) {
        for (int i = 0;i < used.length;i ++) {
            if (used[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
