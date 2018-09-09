package 校招笔试.头条.头条三轮;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/9/9.
 */
public class ip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        ip(s);
    }
    public static void ip (String s) {
        List<String> list = new ArrayList<>();
        dfs(s, 0, 0, list);
        System.out.println(allList.size());
    }
    static List<List<String>> allList = new ArrayList();
    public static void dfs(String str, int cur, int num, List<String> list) {
        if (num == 4 && cur == str.length()) {
            allList.add(new ArrayList(list));
            return;
        }
        for (int i = cur;i < cur + 3 && i < str.length();i ++) {
            String ss = str.substring(cur,i + 1);
            if (legal(ss)) {
                list.add(ss);
                dfs(str,i + 1, num + 1, list);
                list.remove(list.size() - 1);
            }
        }
    }

    public static boolean legal(String s) {
        if (s.charAt(0) == '0' && s.length() != 1)return false;
        if (Integer.parseInt(s) <= 255 && Integer.parseInt(s) >= 0) {
            return true;
        }
        return false;
    }
}
