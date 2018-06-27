package 牛客往年真题.笔试17年.网易;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/21.
 */
public class 两种排序方法 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int n = Integer.parseInt(line);
        String []s = new String[n];
        for(int i = 0; i < n;i ++) {
            line = scanner.nextLine();
            s[i]  = line;
        }
        if (lexicographically(s) && lengths(s)) {
            System.out.println("both");
        }
        else if (lexicographically(s)) {
            System.out.println("lexicographically");
        }
        else if (lengths(s)) {
            System.out.println("lengths");
        }
        else {
            System.out.println("none");
        }
    }
    public static boolean lexicographically(String []s) {
        String[] sort = Arrays.copyOf(s, s.length);
        Arrays.sort(sort);
        for (int i = 0;i < s.length;i ++) {
            if (!s[i].equals(sort[i])) {
                return false;
            }
        }
        return true;
    }
    public static boolean lengths(String []s) {
        String[] sort = Arrays.copyOf(s, s.length);
        Arrays.sort(sort, (a,b) -> a.length() - b.length());
        for (int i = 0;i < s.length;i ++) {
            if (!s[i].equals(sort[i])) {
                return false;
            }
        }
        return true;
    }

}
