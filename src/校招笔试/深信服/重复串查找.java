package 校招笔试.深信服;


import org.omg.CORBA.MARSHAL;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/6/21.
 */
public class 重复串查找 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        find(s);
    }
    public static void find(String s) {
        int max = 0;
        for (int i = 0;i < s.length();i ++) {
            for (int j = i + 1;j < s.length();j ++) {
                if (j + j - i <= s.length()) {
                    String s1 = s.substring(i, j);
                    String s2 = s.substring(j, j + j - i);
                    if (s1.equals(s2)) {
                        max = Math.max(s1.length(), max);
                    }
                }
            }
        }
        System.out.println(max * 2);
    }
//    public static void find(String s) {
//        String []tail = new String[s.length()];
//        for (int i = 0;i < s.length();i ++) {
//            tail[i] = s.substring(i);
//        }
//        Arrays.sort(tail);
//        int max = 0;
//        String str = "";
//        String maxStr = "";
//        for (int i = 0;i < tail.length - 1;i ++) {
//            str = same(tail[i], tail[i + 1]);
//            max = Math.max(str.length(), max);
//            if (str.length() > max) {
//                maxStr = str;
//            }
//        }
////        for (String ss : tail) {
////            System.out.println(ss);
////        }
//        for (int i = 0;i < s.length();i ++) {
//            for (int j = j)
//        }
//        System.out.println(max * 2);
//    }
//    public static String same(String a, String b) {
//        StringBuilder sb =  new StringBuilder();
//        for (int i = 0;i < a.length() && i < b.length();i ++) {
//            if (a.charAt(i) == b.charAt(i)) {
//                sb.append(a.charAt(i));
//            }
//        }
//        return sb;
//    }

}
