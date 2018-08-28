package 校招笔试.头条.头条二轮;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/8/25.
 */
public class Pm25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
    class Solution {
        public int lengthOfLIS(int[] nums) {
            if (nums == null || nums.length == 0)return 0;
            if (nums.length == 1)return 1;
            int []dp = new int[nums.length];
            dp[0] = 1;

            for (int i = 1;i < nums.length;i ++) {
                for (int j = 0;j < i;j ++) {
                    if (nums[i] > nums[j]) {
                        dp[i] = Math.max(dp[j] + 1, dp[i]);
                    }else {
                        dp[i] = Math.max(dp[i], 1);
                    }
                }
            }

            int max = 0;
            for (int i = 0;i < dp.length;i ++) {
                max = Math.max(max, dp[i]);
            }
            return max;
        }
    }
}
