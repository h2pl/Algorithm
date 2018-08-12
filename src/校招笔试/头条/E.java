package 校招笔试.头条;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/8/12.
 3
 10
 0 3 3 7 7 0

 4
 10
 0 4 2 5 3 7 5 8
 */
public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [][]arr = new int[n][2];
        for (int i = 0;i < n;i ++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
            if (arr[i][1] < arr[i][0] ) {
                arr[i][1] = arr[i][1] + m;
            }
        }
        func(arr, m);
    }
    public static void func(int [][]arr, int m) {
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int cnt = 1;
        for (int i = 0;i < arr.length - 1;) {
            int temp = i;
            for (int j = i + 1;j < arr.length;j ++) {
                if (arr[j][0] >= arr[i][1]) {
                    cnt++;
                    i = j;
                    break;
                }
            }
            if (temp == i) {
                i++;
            }
        }
        System.out.println(cnt);
    }
}
