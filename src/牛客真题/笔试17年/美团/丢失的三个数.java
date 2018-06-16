package 牛客真题.笔试17年.美团;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/6/13.
 */
public class 丢失的三个数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []arr = new int[10001];
        for(int i = 1;i <= 9997;i ++) {
            int n = scanner.nextInt();
            arr[n] = 1;
        }

        int []a = new int[3];
        int j = 0;
        for (int i = 1;i <= 10000;i ++) {
            if (arr[i] == 0) {
                a[j ++] = i;
            }
            continue;
        }
        Arrays.sort(a);
        String s = String.valueOf(a[0]) + String.valueOf(a[1]) + String.valueOf(a[2]);
        long res = Long.parseLong(s);
        System.out.println(res % 7);
    }
}
