package 数据结构常用算法.排序;

/**
 * Created by 周杰伦 on 2018/6/27.
 */
public class 桶排序 {
    public static void main(String[] args) {
        int []arr = {1,3,41,5,8,8,4,61};
        tongSort(arr, 61);
    }
    public static void tongSort(int []arr, int max) {
        int []map = new int[max + 1];
        for (int i = 0;i < arr.length;i ++) {
            map[arr[i]] += 1;
        }
        for (int i = 0;i < map.length;i ++) {
            int j = map[i];
            while (j -- > 0) {
                System.out.print(i + " ");
            }
        }
    }
}
