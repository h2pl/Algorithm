package 剑指offer二刷.字符串;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by 周杰伦 on 2018/6/27.
 */
public class 数据流字符出现的个数 {
    public static void main(String[] args) {
        for (int i = 0;i < 10;i ++) {
            Insert(i);
            System.out.println(GetMedian());
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    public static void Insert(Integer num) {
        list.add(num);
        Collections.sort(list);
    }

    public static Double GetMedian() {
        if (list.size() % 2 == 0) {
            int l = list.get(list.size()/2);
            int r = list.get(list.size()/2 - 1);
            return (l + r)/2.0;
        }
        else {
            return list.get(list.size()/2)/1.0;
        }
    }
}
