package 过去笔试记录.In2018.Written.京东;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/4/9.
 */
public class 分解整数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int t = Integer.parseInt(line);
        for (int i = 0;i < t;i ++) {
            String str = scanner.nextLine();
            long a = Long.parseLong(str);
            printXY(a);
        }
        scanner.close();
    }
    public static void printXY(long num) {
        long y = 2, x = num/2;
        if (x % 2 != 1) {
            x += 1;
        }
        while (y < x) {
            if (x * y > num) {
                x -= 2;
            }else if (x * y < num) {
                y += 2;
            }else {
                if (x % 2 == 1 && y % 2 == 0) {
                    System.out.println(x + " " + y);
                    return;
                }
            }
        }
        System.out.println("No");
        return;
    }
}
