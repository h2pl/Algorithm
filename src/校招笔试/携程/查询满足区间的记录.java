package 校招笔试.携程;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/9/4.
 */
public class 查询满足区间的记录 {
    static class Time{
        String id;
        String begin;
        String end;

        public Time(String id, String begin, String end) {
            this.id = id;
            this.begin = begin;
            this.end = end;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String time = scanner.next();
        List<String> res = new ArrayList<>();

        for (int i = 0;i < n;i ++) {
            String id = scanner.next();
            String begin = scanner.next();
            String end = scanner.next();
            if (begin.compareTo(time) <= 0 && end.compareTo(time) >= 0) {
                res.add(id);
            }
        }
        find(res, time);
    }

    public static void find(List<String> res, String time) {

        Collections.sort(res);
        if (res.isEmpty()) {
            System.out.println("null");
        }else {
            for (String id : res) {
                System.out.println(id);
            }
        }
    }
}
