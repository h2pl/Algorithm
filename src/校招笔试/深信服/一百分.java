package 校招笔试.深信服;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/6/21.
 */
public class 一百分 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];
        for (int i = 0;i < n;i ++) {
            arr[i] = scanner.nextInt();
        }
        sum(arr);
    }
    public static void sum(int []arr) {
        List<Integer> list = new ArrayList<>();
        int []visit = new int[arr.length];
        backtrace(arr,0, 0, list, visit);
    }
    public static void backtrace(int []arr, int cur, int sum, List<Integer> list, int []visit ) {
        if (sum == 100) {
            System.out.println(list.size());
            for (int i : list) {
                System.out.println(i);
            }
            return;
        }

        for (int i = cur;i < arr.length;i ++ ) {
            if (visit[i] == 0 && sum + arr[i] <= 100) {
                list.add(i + 1);
                visit[i] = 1;
                backtrace(arr, i, sum + arr[i], list, visit);
                visit[i] = 0;
                list.remove(list.size() - 1);
            }
        }
    }
}
