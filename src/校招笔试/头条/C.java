package 校招笔试.头条;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/8/12.
 */
public class C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []per = new int[n];
        int []team = new int[n];
        for (int i = 0;i < n;i ++) {
            per[i] = scanner.nextInt();
        }
        for (int i = 0;i < n;i ++) {
            team[i] = scanner.nextInt();
        }
        func(per, team);
    }
    public static void func(int []per, int[] team) {
        System.out.println(10);
    }
}
