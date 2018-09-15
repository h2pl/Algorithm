package 校招笔试.东方财富;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/9/15.
 */
public class 划分子数组 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];
        for (int i = 0;i < n;i ++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(canPartition(arr));
    }
    public static boolean canPartition(int[] nums) {
        if(nums == null || nums.length == 0) return false;
        int total = 0;
        for(int i = 0; i < nums.length; i++) total += nums[i];
        if(total % 2 != 0) return false;
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        return helper(nums, list, 0, 0, total);
    }

    public static boolean helper(int[] nums, List<Integer> list, int pos, int sum, int total)
    {
        if(total == 2 * sum) return true;
        if(total < 2 * sum) return false;
        boolean res = false;
        for(int i = pos; i < nums.length; i++)
        {
            if(i == pos || nums[i - 1] != nums[i])
            {
                list.add(nums[i]);
                res = res || helper(nums, list, i + 1, sum + nums[i], total);
                if(res) return true;
                list.remove(list.size() - 1);
            }
        }
        return false;
    }
}
