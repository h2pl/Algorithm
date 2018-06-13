package 过去笔试记录.In2018.Written.头条;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/3/24.
 */
public class 去重 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String temp = input.nextLine();
        String[] ss = temp.trim().split(" ");
        int n = Integer.parseInt(ss[0]);
        int k = Integer.parseInt(ss[1]);
        String a = input.nextLine();
        String[] arr = a.trim().split(" ");
        int []num=new int[n];
        for(int i=0;i<arr.length;i++){
            num[i]=Integer.parseInt(arr[i]);
        }
        System.out.println(findPairs(num, k));
    }

    public static int findPairss(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0)   return 0;

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                if (entry.getValue() >= 2) {
                    count++;
                }
            } else {
                if (map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static int findPairs(int[] nums, int k) {
        if (nums.length <= 1) return 0;
        int count = 0;
        Arrays.sort(nums);
        int l = 0,r = 1;
        while(r < nums.length && l < nums.length) {
            if(nums[l] == nums[r] - k) {
                count++;
                r++;
                l++;
                while(r < nums.length && nums[r] == nums[r - 1]){
                    r++;
                }
            }else if(nums[l] < nums[r] - k && l < r - 1) {
                l++;
            }
            else {
                r++;
            }
        }
        return count;
    }
}
