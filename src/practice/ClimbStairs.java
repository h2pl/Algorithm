package practice;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by 周杰伦 on 2017/3/10.
 */
public class ClimbStairs {
    int climb(int n,int []arr)
    {
        if(arr[n]!=0) {
            return arr[n];
        }
        else {
            arr[n]=climb(n-1,arr)+climb(n-2,arr);
            return arr[n];
        }
    }

    int climbstairs(int n){

        if(n==1)return 1;
        if(n==2)return 2;
        if(n>2) {
            int []arr=new int[n+1];
            arr[1]=1;
            arr[2]=2;
            return climb(n,arr);
        }
        return 0;
    }
    @Test
    public void test(){
       System.out.println(climbstairs(10));
    }
}
