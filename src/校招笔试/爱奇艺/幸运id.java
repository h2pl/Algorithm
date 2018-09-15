package 校招笔试.爱奇艺;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/9/15.
 */
public class 幸运id {
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int []arr = new int[s.length()];
        for (int i = 0;i < s.length();i ++) {
            arr[i] = Integer.parseInt(s.substring(i, i + 1));
        }
//        System.out.println(Arrays.toString(arr));
        min = Integer.MAX_VALUE;
        int a = 0;
        int b = 0;
        for (int i = 0;i < 2;i ++) {
            a += arr[i];
        }
        for (int i = 3;i < 6;i ++) {
            b += arr[i];
        }
        if ( a == b){
            System.out.println(0);
        }
        else if ( a <  b) {
            dfs1(arr, 0);
            System.out.println(min);
        }else {
            dfs2(arr, 0);
            System.out.println(min);
        }

    }
    public static void dfs1(int []arr, int cnt) {
        if (legal(arr)) {
            min = Math.min(cnt, min);
            return;
        }

        int a = 0;
        int b = 0;
        for (int i = 0;i < 2;i ++) {
            a += arr[i];
        }
        for (int i = 3;i < 6;i ++) {
            b += arr[i];
        }
        if (a < b) {
            int diff = b - a;
            for (int i = 0;i < 3;i ++) {
                int temp = arr[i];
                if (9 - arr[i] >= diff) {
                    arr[i] = arr[i] + diff;
                    dfs1(arr, cnt + 1);
                    arr[i] = temp;
                }else {
                    arr[i] = 9;
                    dfs1(arr, cnt + 1);
                    arr[i] = temp;
                }
            }
            for (int i = 3;i < 6;i ++) {
                int temp = arr[i];
                if (arr[i] - 0 >= diff) {
                    arr[i] = arr[i] - diff;
                    dfs1(arr, cnt + 1);
                    arr[i] = temp;
                }else {
                    arr[i] = 0;
                    dfs1(arr, cnt + 1);
                    arr[i] = temp;
                }
            }
        }
    }
    public static void dfs2(int []arr, int cnt) {
        if (legal(arr)) {
            min = Math.min(cnt, min);
            return;
        }

        int a = 0;
        int b = 0;
        for (int i = 0;i < 2;i ++) {
            a += arr[i];
        }
        for (int i = 3;i < 6;i ++) {
            b += arr[i];
        }
        if (a > b) {
            int diff = a - b;
            for (int i = 3;i < 6;i ++) {
                int temp = arr[i];
                if (9 - arr[i] >= diff) {
                    arr[i] = arr[i] + diff;
                    dfs2(arr, cnt + 1);
                    arr[i] = temp;
                }else {
                    arr[i] = 9;
                    dfs2(arr, cnt + 1);
                    arr[i] = temp;
                }
            }
            for (int i = 0;i < 3;i ++) {
                int temp = arr[i];
                if (arr[i] - 0 >= diff) {
                    arr[i] = arr[i] - diff;
                    dfs2(arr, cnt + 1);
                    arr[i] = temp;
                }else {
                    arr[i] = 0;
                    dfs2(arr, cnt + 1);
                    arr[i] = temp;
                }
            }
        }
    }
    public static boolean legal(int []arr) {
        int a = 0;
        int b = 0;
        for (int i = 0;i < 3;i ++) {
            a += arr[i];
        }
        for (int i = 3;i < 6;i ++) {
            b += arr[i];
        }
        return a == b;
    }
}
