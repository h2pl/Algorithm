package 七月算法.递归;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 周杰伦 on 2018/5/30.
 */
public class 全排列 {
    public static void main(String[] args) {
        int []arr = {1,2,3};
        List<int []> list = new ArrayList<>();
        all(arr, 0, arr.length - 1, list);
    }
    //注意要换完为之，因为每换一次可以去掉头部一个数字，这样可以避免重复
    public static void all(int []arr, int cur, int end, List<int[]> list) {
        if (cur == end) {
            System.out.println(Arrays.toString(arr));
            list.add(arr);
        }
        for (int i = cur;i <= end;i ++) {
            //这里的交换包括跟自己换，所以只有一轮换完才能确定一个结果
            swap(arr, cur, i);
            all(arr, cur + 1, end, list);
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
