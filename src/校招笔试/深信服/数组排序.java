package 校招笔试.深信服;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/6/21.
 */
public class 数组排序 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];
        for (int i = 0;i < n;i ++) {
            arr[i] = scanner.nextInt();
        }
        mergeSort(arr);
        System.out.println(count);
    }

    public static void find(int []arr) {
        int sum = 0;
        for (int i = 0;i < arr.length;i ++) {
            for (int j = i + 1;j < arr.length;j ++) {
                if (arr[j] < arr[i]) {
                    sum ++;
                }
            }
        }
        System.out.println(sum);
    }
    static int count = 0;

    // 将有二个有序数列a[first...mid]和a[mid...last]合并。
    static void mergearray(int a[], int first, int mid, int last, int temp[]) {
        int i = first, j = mid + 1;
        int m = mid, n = last;
        int k = 0;
        while (i <= m && j <= n) {
            if (a[i] > a[j]) {
                // 左数组比右数组大
                temp[k++] = a[j++];
                // 因为如果a[i]此时比右数组的当前元素a[j]大，
                // 那么左数组中a[i]后面的元素就都比a[j]大
                // 【因为数组此时是有序数组】
                count += mid - i + 1;
            } else {
                temp[k++] = a[i++];
            }
        }
        while (i <= m) {
            temp[k++] = a[i++];
        }
        while (j <= n) {
            temp[k++] = a[j++];
        }
        for (i = 0; i < k; i++)
            a[first + i] = temp[i];
    }

    static void mergesort(int a[], int first, int last, int temp[]) {
        if (first < last) {
            int mid = (first + last) / 2;
            mergesort(a, first, mid, temp); // 左边有序
            mergesort(a, mid + 1, last, temp); // 右边有序
            mergearray(a, first, mid, last, temp); // 再将二个有序数列合并
        }
    }

    static void mergeSort(int a[]) {
        int[] p = new int[a.length];
        mergesort(a, 0, a.length - 1, p);
    }
}
