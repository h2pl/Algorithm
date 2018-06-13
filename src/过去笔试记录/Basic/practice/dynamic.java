package 过去笔试记录.Basic.practice;

import org.junit.Test;

/**
 * Created by 周杰伦 on 2017/3/10.
 */
public class dynamic {
    public int fib(int n){
        if(n==1 || n==2)return n;
        else {
            int []arr=new int[n+1];
            arr[1]=1;
            arr[2]=2;
            for(int i=3;i<=n;i++){
                arr[i]=arr[i-1]+arr[i-2];
            }
            return arr[n];

        }


    }

    int shrink(int n){
        if(n==1 || n==2)return n;
        else {
            int a,b,t=0;
            a=1;
            b=2;
            for(int i=3;i<=n;i++){
                t=a+b;
                a=b;
                b=t;
            }
            return t;

        }
    }



    @Test
    public void test(){
        System.out.println(shrink(10));
    }
}
