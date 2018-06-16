package 牛客真题.笔试17年.头条;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/6/6.
 */
public class 头条校招 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];
        for (int i = 0;i < n;i ++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(num(arr));
    }
    public static int num(int []arr) {
        Arrays.sort(arr);
        int cnt = 0;
        for (int i = 1;i < arr.length;i ++) {
            if (arr[i] - arr[i - 1] <= 10) {

            }
            else {
                int d = arr[i] - arr[i - 1];
                if (d % 10 == 0) {
                    cnt += d/10 - 1;
                }else {
                    cnt += d % 10;
                }
            }
        }
        while ((cnt + arr.length)% 3 != 0) {
            cnt ++;
        }
        return cnt;
    }
}
