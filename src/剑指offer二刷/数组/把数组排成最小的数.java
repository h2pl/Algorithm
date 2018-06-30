package 剑指offer二刷.数组;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by 周杰伦 on 2018/6/27.
 */
public class 把数组排成最小的数 {
    public static void main(String[] args) {
        Integer []arr = {1,3,23,21};
        sortMin(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortMin(Integer []arr) {
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = String.valueOf(o1) + String.valueOf(o2);
                String s2 = String.valueOf(o2) + String.valueOf(o1);
                return s1.compareTo(s2);
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        });
    }
}
