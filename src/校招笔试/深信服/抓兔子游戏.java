package 校招笔试.深信服;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/6/21.
 */
public class 抓兔子游戏 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int []check = new int[k];

        for (int i = 0;i < k;i ++) {
            check[i] = scanner.nextInt();
        }
        if (k <= 0) {
            System.out.println("No");
        }
        else if (k == 1 && n >= 2) {
            System.out.println("No");
        }
        else {
            System.out.println(getRabbit(n, check));
        }
    }
    public static String getRabbit(int n, int []check) {
        //每个洞至少查两遍
        int []arr = new int[check.length];
        for (int i = 0;i < check.length;i ++) {
            arr[check[i]] ++;
        }
        for (int i = 0;i < arr.length;i ++) {
            if (arr[i] == 1) {
                return "No";
            }
        }
        //连续两洞没查
        for (int i = 0;i < check.length - 1;i ++) {
            if (check[i] == 0 && check[i + 1] == 0) {
                return "No";
            }
        }
        return "Yes";
    }
}
