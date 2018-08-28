package 校招笔试.知乎;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/8/25.
 */
public class 中位数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1,3,7,4,9");
    }

    public int medium(int []a, int[]b) {
        int []arr = new int[a.length + b.length];
        int k = 0;
        for (int i = 0;i < a.length;i ++) {
            arr[k ++] = a[i];
        }
        for (int i = 0;i < b.length;i ++) {
            arr[k ++] = b[i];
        }
        Arrays.sort(arr);
        return arr[arr.length / 2];
    }
}
