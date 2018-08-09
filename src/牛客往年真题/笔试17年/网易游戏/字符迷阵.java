package 牛客往年真题.笔试17年.网易游戏;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/8/9.
 */
public class 字符迷阵 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nums = scanner.nextLine();
        int num = Integer.parseInt(nums);
        for(int i = 0;i < num;i ++) {
            String s = scanner.nextLine();
            String []ss = s.split(" ");
            int m = Integer.parseInt(ss[0]);
            int n = Integer.parseInt(ss[1]);
            char [][]map = new char[m][n];
            for (int j = 0;j < m;j ++) {
                String line = scanner.nextLine();
                for (int k = 0;k < line.length();k ++) {
                    map[j][k] = line.charAt(k);
                }
            }
            String word = scanner.nextLine();
            findWord(map, word);
        }
    }
    public static void findWord(char[][]map, String word) {
        int[] cnt = new int[1];
        cnt[0] = 0;
        for (int i = 0;i < map.length;i ++) {
            for (int j = 0;j < map[0].length;j ++) {
                dfs(map, word, i, j, cnt, "", 0);
            }
        }
        for (int i = 0;i < map.length;i ++) {
            for (int j = 0;j < map[0].length;j ++) {
                dfs1(map, word, i, j, cnt, "", 0);
            }
        }
        for (int i = 0;i < map.length;i ++) {
            for (int j = 0;j < map[0].length;j ++) {
                dfs2(map, word, i, j, cnt, "", 0);
            }
        }
        System.out.println(cnt[0]);
    }
    public static void dfs(char[][]map, String word, int i, int j, int[] cnt, String str, int cur) {
        if (str.equals(word)) {
            cnt[0] = cnt[0] + 1;
            return;
        }
        if (i > map.length - 1 || i < 0 || j > map[0].length - 1 || j < 0 || cur > word.length() - 1) {
            return;
        }
        if (map[i][j] == word.charAt(cur) && str.length() < word.length()) {
            dfs(map, word, i + 1,j, cnt, str + map[i][j], cur + 1);
        }
    }
    public static void dfs1(char[][]map, String word, int i, int j, int[] cnt, String str, int cur) {
        if (str.equals(word)) {
            cnt[0] = cnt[0] + 1;
            return;
        }
        if (i > map.length - 1 || i < 0 || j > map[0].length - 1 || j < 0 || cur > word.length() - 1) {
            return;
        }
        if (map[i][j] == word.charAt(cur) && str.length() < word.length()) {
            dfs(map, word, i, j + 1, cnt, str + map[i][j], cur + 1);
        }
    }
    public static void dfs2(char[][]map, String word, int i, int j, int[] cnt, String str, int cur) {
        if (str.equals(word)) {
            cnt[0]++;
            return;
        }
        if (i > map.length - 1 || i < 0 || j > map[0].length - 1 || j < 0 || cur > word.length() - 1) {
            return;
        }
        if (map[i][j] == word.charAt(cur) && str.length() < word.length()) {
            dfs(map, word, i + 1,j + 1, cnt, str + map[i][j], cur + 1);
        }
    }

}
