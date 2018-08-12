package 校招笔试.头条;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/8/12.
 3
 1,10;32,45
 78,94;5,16
 80,100;200,220;16,32

 */
public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<int[]> list = new ArrayList<>();
        for (int i = 0;i < n;i ++) {
            String s = scanner.next();
            String []ss = s.split(";");
            for (int j = 0;j < ss.length;j ++) {
                String []sss = ss[j].split(",");
                int []arr = new int[2];
                arr[0] = Integer.parseInt(sss[0]);
                arr[1] = Integer.parseInt(sss[1]);
                list.add(arr);
            }
        }

        func(list);

    }
    public static void func(List<int[]> list) {
        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int flag = 1;
        while (flag == 1) {
            flag = 0;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i)[0] < list.get(i - 1)[1]) {
                    flag = 1;
                    int[] arr = new int[2];
                    arr[0] = Math.min(list.get(i)[0], list.get(i - 1)[0]);
                    arr[1] = Math.max(list.get(i)[1], list.get(i - 1)[1]);
                    list.remove(i);
                    list.remove(i - 1);
                    list.add(i, arr);
                }
            }
            list.sort(new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0] - o2[0];
                }
            });

        }
        for (int i = 0;i < list.size();i ++) {
            if (i != list.size() - 1) {
                System.out.print(list.get(i)[0] + "," + list.get(i)[1] + ";");
            }else {
                System.out.print(list.get(i)[0] + "," + list.get(i)[1]);
            }
        }
    }
}
