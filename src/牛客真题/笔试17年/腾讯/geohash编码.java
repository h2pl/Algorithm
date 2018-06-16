package 牛客真题.笔试17年.腾讯;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/6/5.
 */
public class geohash编码 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(encode(a));
    }
    public static String encode(int a) {
        int left = -90;
        int right = 90;

        StringBuilder sb = new StringBuilder();

        while (left < right && sb.length() < 6) {
            int mid = (left + right)/2;
            if (a < mid) {
                right = mid - 1;
                sb.append(0);
            }else {
                left = mid + 1;
                sb.append(1);
            }
        }
        return sb.toString();
    }
}
