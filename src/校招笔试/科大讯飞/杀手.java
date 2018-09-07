package 校招笔试.科大讯飞;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/9/7.
 */
public class 杀手 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];
        for (int i = 0;i < n;i ++) {
            arr[i] = scanner.nextInt();
        }
        kill(arr);
    }

    public static void kill(int []arr) {
        int cnt = 0;
        int []kill = new int[arr.length];
        while (!legal(arr)) {
            cnt ++;
            for (int i = 0;i < arr.length;i ++) {
                if (arr[i] == 0)continue;
                int j = i + 1;
                while (j < arr.length && arr[j] == 0) {
                    j++;
                }
                if (j < arr.length) {
                    if (arr[i] > arr[j]) {
                        kill[j] = 1;
                    }
                }
            }
            for (int i = 0;i < arr.length;i ++) {
                if (kill[i] == 1) {
                    arr[i] = 0;
                }
            }
        }
        System.out.println(cnt);
    }

    public static boolean legal(int []arr) {
        for (int i = 0;i < arr.length;i ++) {
            if (arr[i] == 0)continue;
            int j = i + 1;
            while (j < arr.length && arr[j] == 0) {
                j ++;
            }
            if (j < arr.length) {
                if (arr[j] > arr[i]) {

                }else {
                    return false;
                }
            }
        }
        return true;
    }

}
