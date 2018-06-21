package 校招笔试.深信服;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/6/21.
 */
public class 网站开业 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int []id = new int[m];
        for (int i = 0;i < m;i ++) {
            id[i] = scanner.nextInt();
        }
        goal(id);
    }
    public static void goal(int []id) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : id) {
            if (!list.contains(i)) {
                list.add(i);
            }
        }
        if (list.size() < 10) {
            System.out.println(list.size());
            for (int i : list) {
                System.out.println(i);
            }
        }
        else {
            System.out.println(10);
            for (int i = 0;i < 10;i ++) {
                System.out.println(list.get(i));
            }
        }
    }
}
