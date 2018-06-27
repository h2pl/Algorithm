package 数据结构常用算法.排序;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by 周杰伦 on 2018/6/27.
 */
public class 冒泡 {
    public static void main(String[] args) {
        int []arr = {1,5,79,8,3,4,6,11};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int []arr) {
        int flag = 0;
        for (int j = arr.length - 1;j > 0;j --) {
            flag = 0;
            for (int i = 0;i < j;i ++) {
                if (arr[i] > arr[i + 1]) {
                    flag = 1;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            if (flag == 0) {
                return;
            }
        }
    }
}
