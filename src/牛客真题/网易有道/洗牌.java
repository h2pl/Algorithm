package 牛客真题.网易有道;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/22.
 */
public class 洗牌 {
    //int的最大值是21亿，本题用例最大值是10亿，所以不用long
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int T = Integer.parseInt(line);
        for (int i = 0;i < T;i ++) {
            line = scanner.nextLine();
            String []s = line.split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int []arr = new int[2 * n];
            line = scanner.nextLine();
            s = line.split(" ");
            for (int j = 0;j < 2 * n;j ++) {
                arr[j] = Integer.parseInt(s[j]);
            }
            for (int j = 0;j < k;j ++) {
                wash(arr, n);
            }
            for (int j = 0;j < 2 * n;j ++) {
                if (j == 2 * n - 1) System.out.println(arr[j]);
                else System.out.println(arr[j] + " ");
            }
        }
        scanner.close();
    }

    public static void wash(int []arr,int n) {
        int []left = new int[n];
        int []right = new int[n];
        for (int i = 0;i < n;i ++) {
            left[i] = arr[i];
        }
        for (int i = n;i < arr.length;i ++) {
            right[i - n] = arr[i];
        }
        int l = n - 1;
        int r = n - 1;
        for (int i = 0;i < 2 * n;i ++) {
            if (i % 2 == 0) {
                arr[i] = right[r --];
            }else {
                arr[i] = left[l --];
            }
        }
        return;
    }
}
