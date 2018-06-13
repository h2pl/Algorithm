package 过去笔试记录.Basic.practice;


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
    public int fib06(int n){
        if(n==1||n==2){
            return n;
        }else{
            double sqrtFive=Math.sqrt(5);
            n++;
            double a=Math.pow((1+sqrtFive)/2, n);
            double b=Math.pow((1-sqrtFive)/2, n);
            double result=1/sqrtFive*(a-b);
            return (int) Math.floor(result);
        }
    }


    public void test(){
       System.out.println(fib06(10));
    }
}
