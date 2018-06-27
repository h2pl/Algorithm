package 数据结构常用算法.排序;

import java.util.Arrays;

/**
 * Created by 周杰伦 on 2018/6/27.
 */
public class 选择排序 {
    public static void main(String[] args) {
        int []arr = {9,5,4,6,3,8,2,1,10};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectSort(int []arr) {
        for(int i = 0;i < arr.length;i ++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1;j < arr.length;j ++) {
                min = Math.min(min, arr[j]);
                if (min == arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;
        }
    }
}
