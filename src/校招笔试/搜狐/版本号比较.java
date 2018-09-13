package 校招笔试.搜狐;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/9/13.
 */
public class 版本号比较 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String v1 = scanner.next();
        String v2 = scanner.next();
//        System.out.println(v1);
//        System.out.println(v2);
        System.out.println(compare(v1, v2));
    }
    public static int compare (String v1, String v2) {
        String s1 = v1.substring(10, v1.length() - 1);
        String s2 = v2.substring(10, v2.length() - 1);
        String[]ss1 = s1.split("\\.");
        String[]ss2 = s2.split("\\.");
        for (int i = 0;i < ss1.length && i < ss2.length;i ++) {
            if (ss1[i].compareTo(ss2[i]) > 0) {
                return 1;
            }else if (ss1[i].compareTo(ss2[i]) < 0) {
                return -1;
            }else {
                continue;
            }
        }
        if (ss1.length > ss2.length) {
            return 1;
        }else if (ss2.length > ss1.length) {
            return -1;
        }
        return 0;
    }
}
