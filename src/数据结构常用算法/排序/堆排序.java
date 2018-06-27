package 数据结构常用算法.排序;

import java.util.Arrays;

/**
 * Created by 周杰伦 on 2018/6/27.
 */
public class 堆排序 {
    public static void main(String[] args) {
        int []arr = {1,4,78,2,7,0,5,1,8,11};
        create(arr);
        HeapSort(arr);
    }

    public static void create(int []arr) {
        int n = arr.length - 1;
        for (int i = n/2;i >= 0;i --) {
            siftDown(arr, i, n);
        }
    }
    //小根堆是排序的
    public static void HeapSort(int []arr) {
        create(arr);
        int i = arr.length - 1;

        while (i >= 0) {
            System.out.print(arr[0] + " ");
            arr[0] = arr[i];
            siftDown(arr, 0, i - 1);
            i --;
        }
    }

    //对堆的第i个元素进行调整，此时树最后一个节点位置在n处
    public static void siftDown(int []arr ,int i, int n) {
        int temp = arr[i];
        //标识是否还要继续往下调整
        int flag = 0;
        //t是左右子节点中较小的那个
        int t = 0;
        while (2 * i <= n && flag == 0) {
            //找出两个子节点比较小的那个
            if (arr[i * 2] < arr[i]) {
                t = i * 2;
            }else {
                t = i;
            }
            //如果有右儿子，则讨论右儿子。
            if (i * 2 + 1 <= n) {
                if (arr[i * 2 + 1] < arr[t]) {
                    t = i * 2 + 1;
                }
            }
            //如果最小的编号不是它自己，就和子节点交换。并让i = t，继续向下调整。
            if (t != i) {
                swap(i, t, arr);
                i = t;
                //如果自己是子节点说明调整完毕。
            }else {
                flag = 1;
            }

        }
    }

    public static void swap(int i, int j, int[]arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
