package 校招笔试.京东;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/9/9.
 */
public class 对比 {
    public static class Box{
        int a;
        int b;
        int c;

        public Box(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Box> list = new ArrayList<>();
        for (int i = 0;i < n;i ++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            list.add(new Box(a,b,c));
        }
        compare(list);
    }
    public static void compare(List<Box> list) {
        int cnt = 0;
        list.sort(new Comparator<Box>() {
            @Override
            public int compare(Box o1, Box o2) {
                return 0;
            }
        });
        for (Box box : list) {
            for (Box cmp : list) {
                if (cmp.a > box.a && cmp.b > box.b && cmp.c > box.c) {
                    cnt ++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
