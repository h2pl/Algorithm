package 校招笔试.第四范式;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/9/9.
 */
public class 最长对称子字符串 {
    public static String longestPalindrome(String s) {
        // String solu = null;
        int len = s.length();
        int maxLen = 0;
        String res = null;

        boolean[][] dp = new boolean[len][len];
        for(int i = len - 1;i >= 0;i--){
            for(int j = i;j < len;j++){
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i+1][j-1] == true);//（1）当前遍历到的子串i~j是否是回文子串取决于i+1~j-1，也就是i~j中间的子串是否是回文并且s[i]是否等于s[j]；（2）dp[i][j]是为true则意味着i~j是回文子串，则在下面判断后对res进行更新；如果为false，则该子串不是回文子串，开始遍历下一个子串。

                if(dp[i][j] == true && (res == null || j - i + 1 > maxLen)){//如果该子串长度更长，则更新res
                    res = s.substring(i, j+1);
                    maxLen = res.length();
                }
            }
        }
        return res;
    }

    public static boolean isPalindrome(String s) {

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        // Is PAT&TAP symmetric?
        //result:11
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(longestPalindrome(str));
    }

}
