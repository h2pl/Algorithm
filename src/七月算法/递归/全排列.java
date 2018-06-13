package 七月算法.递归;

import java.util.Arrays;

/**
 * Created by 周杰伦 on 2018/5/30.
 */
public class 全排列 {
    public static void main(String[] args) {
        int []arr = {1,2,3};
        all(arr, 0, arr.length - 1);
    }
    //注意要换完为之，因为每换一次可以去掉头部一个数字，这样可以避免重复
    public static void all(int []arr, int cur, int end) {
        if (cur == end) {
            System.out.println(Arrays.toString(arr));
        }
        for (int i = cur;i <= end;i ++) {
            swap(arr, cur, i);
            all(arr, cur + 1, end);
            swap(arr, cur, i);
        }
    }
    public static void swap(int []arr, int i, int j) {
        if (i > arr.length || j > arr.length || i >= j)return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
