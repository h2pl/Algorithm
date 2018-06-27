package 数据结构常用算法.排序;

import java.util.Arrays;

/**
 * Created by 周杰伦 on 2018/6/27.
 */
public class 插入排序 {
    public static void main(String[] args) {
        int []arr = {2,4,1,5,3,6};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertSort(int []arr) {
        for (int i = 1;i < arr.length;i ++) {
            int j = i;
            int temp = arr[j];
            while (j >= 1 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j --;
            }
            arr[j] = temp;
        }
    }
}
