package 校招笔试.拼多多;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/7/22.
 */
public class 选靓号 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        char []arr = new char[n];
        String s = sc.next();
        for (int i = 0;i < n;i ++) {
            arr[i] = s.charAt(i);
        }
        bfs(arr, k);
    }
    public static void bfs(char []arr, int k) {
        int cost = 0;
        int []num = new int[arr.length];
        int sum = 0;
        for (int i = 0;i < arr.length;i ++) {
            num[i] = Integer.parseInt(String.valueOf(arr[i]));
            sum += num[i];
        }
        int avr = sum/num.length;
        Arrays.sort(num);
        int cur = num[0];
        for (int i = 1;i < num.length;i ++) {
            if (Math.abs(num[i - 1] - avr) < Math.abs(num[i] - avr)){
                cur = num[i - 1];
                break;
            }
        }
        for (int i : num) {

        }
    }
}
