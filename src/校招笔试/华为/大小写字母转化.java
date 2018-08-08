package 校招笔试.华为;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/8/8.
 */
public class 大小写字母转化 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(change(s));
    }
    public static String change(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < s.length();i ++) {
            if (Character.isLowerCase(s.charAt(i))) {
                sb.append(Character.toUpperCase(s.charAt(i)));
            }else if (Character.isUpperCase(s.charAt(i))) {
                sb.append(Character.toLowerCase(s.charAt(i)));
            } else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
