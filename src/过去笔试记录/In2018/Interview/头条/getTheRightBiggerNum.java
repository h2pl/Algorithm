package mianshi.toutiao;

import java.util.Stack;
import java.util.Vector;

/**
 * Created by 周杰伦 on 2018/3/9.
 */
public class getTheRightBiggerNum {
    public static int[] getTheRightBiggerNum(int[] nums){
        int len = nums.length;
        final int Nan = Integer.MIN_VALUE;
        if (len == 0) return nums;

        int[] res = new int[len];
        Stack<Integer> stk = new Stack<>();
        int i = 0;
        while (i < len){
            if (stk.empty() || nums[stk.peek()] >= nums[i])
                stk.push(i++);
            else{
                res[stk.peek()] = nums[i];
                stk.pop();
            }
        }

        while (!stk.empty()){
            res[stk.peek()] = Nan;
            stk.pop();
        }

        return res;
    }
    public static void main(String[] args) {
        int [] arr = {1,3,4,6,2,6,4,7};
        int [] res = getTheRightBiggerNum(arr);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
