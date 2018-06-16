package 牛客真题.笔试17年.网易;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/19.
 */
//简单
public class 下厨房 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        //牛客中这个写法ok的
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] s = line.split(" ");
            map(s, list);
        }
        System.out.println(list.size());
    }

    public static void map(String[] s, List list) {
        for (String str : s) {
            if (list.contains(str)) {
                continue;
            }
            list.add(str);
        }
    }
}
