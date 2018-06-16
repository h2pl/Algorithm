package 牛客真题.笔试16年.美团;

/**
 * Created by 周杰伦 on 2018/6/15.
 */
public class 最大差值 {
    public static void main(String[] args) {
        System.out.println(getDis(new int[] {2676,4662,8383,357,6595}, 5));
    }
    public static int getDis(int[] A, int n) {

        int max = 0;
        for (int i = 0;i < n;i ++) {
            for (int j = i + 1;j < n;j ++) {
                max = Math.max(A[j] - A[i], max);
            }
        }

        return max;
//        // write code here
//        int [][]dp = new int[n + 1][n + 1];
//        dp[0][0] = 0;
//        for (int i = 1;i < n;i ++) {
//            for (int j = i + 1;j < n;j ++) {
//                dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
//            }
//        }
//        return dp[n - 1][n - 1];
    }
}
