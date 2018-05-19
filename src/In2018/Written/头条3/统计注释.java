package In2018.Written.头条3;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/12.
 */
public class 统计注释 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cnt = 0;
        int flag = 0;

        for (int j = 0;j < 1000;j ++) {
            String temp = input.nextLine();
            if (temp.equals(""))break;
            String[] s = temp.trim().split(" ");
            for (int i = 0;i < s.length;i ++) {
                if (legal(temp, i)) {
                    if (s[i].equals("/*")) {
                        flag = 1;
                    } else if (s[i].equals("*/")) {
                        if (flag == 1) {
                            cnt++;
                            flag = 0;
                        }
                    } else if (s[i].equals("//")) {
                        cnt++;
                        break;
                    }
                }
            }
        }

        System.out.println(cnt);
        input.close();
    }

    public static boolean legal(String s,int index) {
        int left = 0,right = 0;
        for (int i = 0;i < index;i ++) {
            if (s.charAt(i) == '\"') {
                left = 1;
            }
        }
        for (int i = index + 1;i < s.length();i ++) {
            if (s.charAt(i) == '\"') {
                right = 1;
            }
        }
        if (left == 1 && right == 1) {
            return false;
        }
        else return true;
    }
}
