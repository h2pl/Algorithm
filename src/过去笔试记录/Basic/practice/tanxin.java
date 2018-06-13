package 过去笔试记录.Basic.practice;

import org.junit.Test;

/**
 * Created by 周杰伦 on 2017/3/12.
 */
public class tanxin {
    int maxLianxuArray(int []arr){
        int sum=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            sum+=arr[i];
            if(sum<0){
                max=0;
            }
            if(sum>max)
            {
                max=sum;
            }
        }
        if(sum<0){
            for(int j=0;j<arr.length;j++){
                if(sum<arr[j]){
                    sum=arr[j];
                }
            }
            return sum;
        }
        return sum;
    }

    int candy(int []height)
    {
        int []candy=new int[height.length];
        for(int k=0;k<height.length;k++)candy[k]=1;

        int sum=0,i;
        for(i=1;i<height.length;i++){
            if(height[i]>height[i-1])
            {
                candy[i]=candy[i-1]+1;

            }
        }

        sum=candy[height.length-1];
        for(int j=height.length-2;j>=0;j--){
            if(height[j]>height[j+1] && candy[j]<=height[j+1])
            {
                candy[j]=candy[j+1]+1;
            }
            sum+=candy[j];
        }
        return sum;
    }
    @Test
    public void test(){
        int []a={2,3,5,4,3,6,1};
        System.out.println(candy(a));
    }
}
