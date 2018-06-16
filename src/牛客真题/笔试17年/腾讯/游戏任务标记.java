package 牛客真题.笔试17年.腾讯;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/6/5.
 */
public class 游戏任务标记 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []arr = new int[1025];
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(task(a, b , arr));
        }
    }
    public static int task(int a,int b, int []arr) {
        if (a > 1024 || a < 1 || b > 1024 || b < 1) return -1;
        arr[a] = 1;
        return arr[b];
    }
}
