package 牛客真题.网易;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/21.
 */
public class 小易喜欢的单词 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        boolean like = like(line);
        if (like) {
            System.out.println("Likes");
        }else {
            System.out.println("Dislikes");
        }
    }

    public static boolean like(String s) {
        if (s.length() == 1)return true;
        return legalcon(s) && legalSub(s);
    }

    public static boolean legalcon(String s) {
        for (int i = 0;i < s.length() - 1;i ++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean legalSub(String s) {
        int i = 0, j = 0;
        int wall = s.length();
        
        return false;
    }

}
