package 校招笔试.拼多多;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/7/22.
 */
public class 运输货物 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(scanner.hasNextInt()) {//注意while处理多个case
            int n = scanner.nextInt();
            list.add(n);
        }
        System.out.println(car(list));
    }
    public static int car(List<Integer> list) {
        int []arr = new int[list.size()];
        int index = 0;
        for (int i : list) {
            arr[index ++] = i;
        }
        Arrays.sort(arr);
        int i = 0,j = arr.length - 1;
        int cnt = 0;

        int end = 0;
        if (arr.length >= 3) {
            for (int k = 0;k + 2 < arr.length;) {
                if (arr[k] == 100 && arr[k + 1] == 100 && arr[k + 2] == 100) {
                    cnt ++;
                    k += 3;
                    end = k;
                }else {
                    k++;
                }
            }
        }
        i = end;

        while (i < j) {
            if (arr[i] + arr[j] <= 300) {
                cnt ++;
                i ++;
                j --;
            }else {
                j --;
                cnt ++;
            }
        }
        if (i == j) {
            cnt += 1;
        }
        return cnt;
    }
}
