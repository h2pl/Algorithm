package 数据结构常用算法.二分查找;

import java.util.Arrays;

/**
 * Created by 周杰伦 on 2018/6/27.
 */
public class 二分 {
    public static void main(String[] args) {
        int []arr = {12,4,6,8,9,3,1,24,7,11};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binSearch(arr, 3));
    }
    public static int binSearch(int []arr, int target) {

        int l = 0,r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] < target) {
                l = mid + 1;
            } else if (arr[mid] > target) {
                r = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
