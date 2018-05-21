package 牛客真题.网易;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/19.
 */
//中等
public class 分苹果 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int n = Integer.parseInt(line);
        line = scanner.nextLine();
        String []s = line.split(" ");
        int []arr = new int[n];

        for (int i = 0;i < n;i ++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(step(arr));
    }
    public static int step(int []arr) {
        int n = arr.length;
        int sum = 0;
        //统计和，计算平均值
        for (int i = 0;i < n;i ++) {
            sum += arr[i];
        }
        int ave = sum/n;
        //如果不能整除，说明无法分配
        if (ave * n != sum) {
            return -1;
        }
        //如果和平均值的差值不为偶数，那么就失败
        for (int i = 0;i < n;i ++) {
            if ((arr[i] - ave) % 2 != 0) {
                return -1;
            }
        }
        //排序数组，以便从大到小统计
        Arrays.sort(arr);
        int rem = 0;
        //统计溢出的值
        for (int i = n - 1;i >= 0;i --) {
            if (arr[i] - ave >= 2) {
                rem += arr[i] - ave;
                arr[i] = ave;
            }
        }
        //将溢出值按需分配。从最小的开始分，如果最小的都满足不了，那就gg
        int count = 0;//统计次数
        for (int i = 0;i < n;i ++) {
            int val = arr[i];
            while (val < ave && rem > 0) {
                count ++;
                rem -= 2;
                val += 2;
            }
            if (val != ave) {
                return -1;
            }
        }
        return count;
    }
}
