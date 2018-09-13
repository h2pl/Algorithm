package 校招笔试.搜狐;


/**
 * Created by 周杰伦 on 2018/9/13.
 */
import java.util.Scanner;

public class 走到目标点 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pos = scanner.nextInt();
        gotoEnd(pos);
    }
    static int min = 0;
    public static void gotoEnd(int pos) {
        min = Integer.MAX_VALUE;
        dfs(pos, 0, 1, 0);
        System.out.println(min);
    }
    public static void dfs(int target, int cur, int go, int cnt) {
        if (target == cur){
            min = Math.min(min, cnt);
            return;
        }
        if (cur < target) {
            if (cur + go <= target) {
                dfs(target, cur + go, go + 1, cnt + 1);
            }else {
                dfs(target, cur - go, go + 1, cnt + 1);
            }
        }
        if (cur > target) {
            if (cur - go >= target) {
                dfs(target, cur - go, go + 1, cnt + 1);
            }else {
                dfs(target, cur + go, go + 1, cnt + 1);
            }
        }
    }
}
