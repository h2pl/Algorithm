package 校招笔试.华为;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/8/1.
 */
public class 广告牌 {
    static int min = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] ss = line.split(" ");
        int n = 0;
        int []arr = new int[ss.length - 1];
        for (int i = 0;i < ss.length - 1;i ++) {
            arr[i] = Integer.parseInt(ss[i]);
        }
        n = Integer.parseInt(ss[ss.length - 1]);
        min = Integer.MAX_VALUE;
        dfs(arr, n, 0, 0);
        System.out.println(min);
    }

    public static void dfs(int []arr, int n, int cur, int cnt) {
        if (cnt == n) {
            int sum = 0;
            int len = 0;
            for (int i = 0;i < arr.length;i ++) {
                if (arr[i] == 0) {
                    int j = i;
                    while (j >= 0 && arr[j] != 1) {
                        j--;
                    }
                    if (j >= 0 && arr[j] == 1) {
                        len = i - j;
                    }
                    j = i;
                    while (j < arr.length && arr[j] != 1) {
                        j++;
                    }
                    if (j <arr.length && arr[j] == 1) {
                        len = Math.min(len, j - i);
                    }
                    sum += len;
                }
            }
            if (min > cnt) {
                min = sum;
            }
        }

        for (int i = cur;i < arr.length;i ++) {
            if (arr[i] != 1 && cnt < n) {
                arr[i] = 1;
                dfs(arr, n, i + 1, cnt + 1);
                arr[i] = 0;
            }
        }
    }

    public static void ad(int []arr, int n) {
        if (n == 1) {
            int sum = 0;
            int mid = arr.length / 2;
            for (int i = 0; i < arr.length; i++) {
                if (i != mid) {
                    sum += Math.abs(i - mid);
                }
            }
            System.out.println(sum);
        } else {
            int part = arr.length / n;
            int rem = arr.length % n;
            int cnt = 0;
            int i = part - 1;
            while (i > 0) {
                cnt += i;
                i--;
            }
            cnt *= n;
            while (rem > 0) {
                cnt += rem;
                rem--;
            }
            System.out.println(cnt);
        }
    }

}
