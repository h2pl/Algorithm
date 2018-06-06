package 牛客真题.京东;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by 周杰伦 on 2018/6/6.
 */
public class 集合 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int []a = new int[n];
        int []b = new int[m];

        for (int i = 0;i < n;i ++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0;i < m;i ++) {
            b[i] = scanner.nextInt();
        }
        Object []res = merge(a, b);
        for (int i = 0;i < res.length;i ++) {
            if (i == res.length - 1) {
                System.out.print(res[i]);
            }else {
                System.out.print(res[i] + " ");
            }
        }
    }

    public static Object[] merge(int []a, int []b) {
        Set<Integer> set = new TreeSet<>();
        for (int i : a) {
            set.add(i);
        }
        for (int i : b) {
            set.add(i);
        }
        Object[] res = set.toArray();
        return res;
    }
}
