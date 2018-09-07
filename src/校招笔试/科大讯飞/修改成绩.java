package 校招笔试.科大讯飞;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/9/7.
 */
public class 修改成绩 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0;i < n;i ++){
            int len = scanner.nextInt();
            int score = scanner.nextInt();
            int[] arr = new int[len];
            for (int j = 0;j < len;j ++) {
                arr[j] = scanner.nextInt();
            }
            System.out.println(min(score, arr));
        }
    }

    public static int min(int score, int []arr){
        Arrays.sort(arr);
        int cnt = 0;
        int num = 0;
        for (int i = 0;i < arr.length;i ++) {
            cnt += arr[i];
        }
        int sum = score * arr.length;

        if (cnt >= sum) {
            return 0;
        }

        for(int i = 0;i < arr.length;i ++) {
            int diff = 100 - arr[i];
            cnt += diff;
            num ++;
            if (cnt >= sum) {
                return num;
            }
        }
        return arr.length;
    }
}
