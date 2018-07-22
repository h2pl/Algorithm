package 校招笔试.拼多多;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/7/22.
 */
public class 球王 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String []goal = new String[n];
        Arrays.fill(goal, "");
        for (int i = 0;i < m;i ++) {
            String s = scanner.next();
            for (int j = 0;j < s.length();j ++) {
                goal[j] += s.charAt(j);
            }
        }
        if (n == 1) {
            System.out.println(0);
        }else {
            System.out.println(king(goal));
        }
    }
    public static int king(String []goal) {
        String []temp = Arrays.copyOf(goal, goal.length);
        Arrays.sort(goal);
        if (goal[0].equals(goal[1])) {
            return -1;
        }
        int diff = 0;
        for (int i = 0;i < goal[0].length();i ++) {
            if (goal[0].charAt(i) > goal[1].charAt(i)) {
                diff ++;
            }else {
                diff --;
            }
        }
        if (diff == 0) {
            return -1;
        }
        for (int i = 0;i < temp.length;i ++) {
            if (goal[0].equals(temp[i])){
                return i;
            }
        }
        return -1;
    }
}
