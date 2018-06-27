package 数据结构常用算法.排序;

import java.util.Arrays;

/**
 * Created by 周杰伦 on 2018/6/27.
 */
public class 归并 {
    public static void main(String[] args) {
        int []arr = {1,4,8,9,4,2,8,11};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void merge(int []arr, int left, int mid, int right) {

        int i = left,j = mid + 1;
        int []temp = new int[right - left + 1];
        int k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] >= arr[j]) {
                temp[k ++] = arr[j++];
            }else {
                temp[k ++] = arr[i++];
            }
        }
        while (i <= mid) {
            temp[k ++] = arr[i ++];
        }
        while (j <= right) {
            temp[k ++] = arr[j ++];
        }

        for (int w = left;w <= right;w ++) {
            arr[w] = temp[w - left];
        }
    }

    public static void mergeSort(int []arr, int left, int right) {
        if (left >= right)return;
        int mid = (left + right)/2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr,left, mid, right);
    }
}
