package 校招笔试.拼多多.第二波;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/8/30.
 */
public class 拼词游戏 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int len = scanner.nextInt();
        String []ss = new String[n];
        for (int i = 0;i < n;i ++) {
            ss[i] = scanner.next();

        }
            word(len, ss);

    }
    static List<String> list = new ArrayList<>();

    public static void word(int len, String []ss) {
        dfs(ss, 0, "");
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list.get(0));
    }
    public static void dfs(String []ss, int cur, String word) {
        if (word.length() == ss[0].length()) {
            if (!list.contains(word)) {
                list.add(word);
            }
            return;
        }
        for (int i = 0;i < ss.length;i ++) {
            dfs(ss, cur + 1, word + ss[i].charAt(cur));
        }
    }

}
