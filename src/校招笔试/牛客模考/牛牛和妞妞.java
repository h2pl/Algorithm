package 校招笔试.牛客模考;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/6/14.
 */
public class 牛牛和妞妞 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []a = new int[3];
        int []b = new int[3];

        for (int i = 0;i < 3;i ++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0;i < 3;i ++) {
            b[i] = scanner.nextInt();
        }
        System.out.println(win(a, b));
    }
    public static String win(int []a, int []b) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1;i <= 13;i ++) {
            list.add(i);
            list.add(i);
            list.add(i);
            list.add(i);
        }
        list.remove(Integer.valueOf(a[0]));
        list.remove(Integer.valueOf(a[1]));
        list.remove(Integer.valueOf(a[2]));

        list.remove(Integer.valueOf(b[0]));
        list.remove(Integer.valueOf(b[1]));
        list.remove(Integer.valueOf(b[2]));

//        for (int i : list) {
//            System.out.println(i);
//        }

        int sumA = a[0] + a[1] + a[2];
        int sumB = b[0] + b[1] + b[2];
        int diff = sumA - sumB;
        if (diff == 0) {
            return "0.5000";
        }else {
            return cnt(list, diff);
        }
    }

    public static String cnt(List<Integer> list, int diff) {
        double cnt = 0;
        for (int i = 0;i < list.size();i ++) {
            for (int j = 0;j < list.size();j ++) {
                if (i != j && list.get(i) + diff > list.get(j)) {
                    cnt ++;
                }
            }
        }

//        System.out.println(cnt);
        DecimalFormat dec = new DecimalFormat("0.0000");
        System.out.println(cnt / 2116.0000);
        String s= dec.format(cnt / 2116.0000);
        return s;
    }
}
