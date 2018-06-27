package 数据结构常用算法.排序;

import java.util.Arrays;

/**
 * Created by 周杰伦 on 2018/6/27.
 */
public class 快排 {
    public static void main(String[] args) {
        int []arr = {1,5,7,8,2,4,9,10};
        quickSort(arr, 0 ,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int []arr, int l, int r) {
        if (l >= r) {
            return;
        }

        int left = l,right = r;
        int temp = arr[l];
        while (left < right) {
             while (left < right && arr[right] >= temp) {
                 right --;
             }
             while (left < right && arr[left] <= temp) {
                 left ++;
             }

             //此处判断防止交叉
             if ( left < right) {
                 int a = arr[left];
                 arr[left] = arr[right];
                 arr[right] = a;

             }
        }

        arr[l] = arr[left];
        arr[left] = temp;

        quickSort(arr, l, left - 1);
        quickSort(arr, left + 1, r );
    }
}
