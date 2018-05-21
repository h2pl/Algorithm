package 牛客真题.网易;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/20.
 */
//错误
public class 数列还原 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] s = line.split(" ");
        int n = Integer.parseInt(s[0]);
        long k = Long.parseLong(s[1]);
        line = scanner.nextLine();
        s =  line.split(" ");
        int []arr = new int[n];
        for (int i = 0;i < n;i ++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(num(arr, k));
    }
    //暴力枚举不可取。考虑回溯
//    public static int num(int []arr, int k) {
//        int []seq = new int[arr.length];
//        int cnt = 0;
//        //分别表示剩余的数和0的位置
//
//        int []rem = new int[arr.length + 1];
//        for (int i = 0;i < arr.length;i ++) {
//            if(arr[i] != 0) {
//                //该数不能再出现
//                rem[arr[i]] = 0;
//            }
//        }
//        int i = 1,j = 0;
//        return 1;
//    }
    //
    public static int num(int []arr, long k) {
        int []seq = Arrays.copyOf(arr, arr.length);
        int cp = 0;
        //统计初始顺序对
        cp = cp(seq);
        //表示某个数是否已经加入数组，这些数不能再使用
        int []visit = new int[seq.length + 1];
        int usednums = 0;
        for (int i = 0;i < seq.length;i ++) {
            if (seq[i] != 0) {
                usednums ++;
                visit[seq[i]] = 1;
            }
        }
        int []cnt = new int[1];
        dfs(seq, cp, k, cnt, visit, usednums);
        return cnt[0];
    }

    public static void dfs(int []arr, int cp, long k, int []cnt, int[] visit, int usednums) {
        if (cp > k)return;
        if (usednums == arr.length && cp == k) {
            cnt[0] ++;
            return;
        }
        for (int i = 0;i < arr.length;i ++) {
            if (arr[i] == 0) {
                for (int j = 1;j < visit.length;j ++) {
                    if (visit[j] == 0) {
                        arr[i] = j;
                        usednums ++;
                        visit[j] = 1;
                        cp = cp(arr);

                        dfs(arr, cp, k, cnt, visit, usednums);
                        //回溯
                        visit[j] = 0;
                        usednums --;
                    }
                }
                arr[i] = 0;
            }
        }
    }

    public static int cp(int []seq){
        int cp = 0;
        for (int i = 0;i < seq.length;i ++) {
            for (int j = 0;j < seq.length;j ++) {
                if (i > j && seq[i] > seq[j] && seq[j] > 0) {
                    cp ++;
                }
            }
        }
        return cp;
    }
}
