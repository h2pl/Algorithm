package 过去笔试记录.In2018.Written.招行信用卡;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/3/29.
 */
public class 子串是否首尾拼接 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str == null || str.equals("")) System.out.println("false");
        String res = "false";
        int flag = 0;
        if (str.length() % 2 != 0) {
            char a = str.charAt(0);
            for (int i = 0;i < str.length();i ++) {
                if (str.charAt(i) != a)  {
                    flag = 1;
                    break;
                }
            }
        }
        else {
            for (int i = 0;i < str.length();i ++) {
                String sub = str.substring(0,i);
                if (!sub.equals(str.substring(str.length() - i - 1, str.length() - 1))) {
                    flag = 1;
                    break;
                }
                else {
                    while (sub.length() <= str.length()) {
                        if (sub.equals(str)) {
                            flag = 0;
                            res = str.substring(0,i);
                            break;
                        }else flag = 1;
                        sub = sub + sub;
                    }
                }
            }
        }
        if (flag == 0) {
            if (str.length() % 2 != 0) {
                System.out.println(str.charAt(0));
            } else {
                System.out.println(res);
            }
        }else System.out.println("false");

    }
}
