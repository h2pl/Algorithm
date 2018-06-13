package 过去笔试记录.In2017.exam;

import java.util.Arrays;

/**
 * Created by 周杰伦 on 2017/3/24.
 * 题目描述

 任意2n个整数，从其中选出n个整数，使得选出的n个整数和同剩下的n个整数之和的差最小。
 */
public class findNum {
    public int[] findNum(int []num){

        Arrays.sort(num);
        int len=num.length/2;
        int left=0,right=0;

        int []div1=new int[len];
        int index1=0,index2=0;
        int []div2=new int[len];
        int min=Integer.MAX_VALUE;
        int []temp=new int[len];

        int sum1=0,sum2=0;
        for(int i=0;i<num.length;i++){
            left=i+1;right=i+len;
            for (int j=left;j<=right;j++){
               div1[index1++]=num[j];
               sum1+=num[j];
            }

            for(int k1=0;k1<left;k1++){
                div2[index2++]=num[k1];
                sum2+=num[k1];
            }
            for (int k2=right+1;k2<num.length;k2++){
                div2[index2++]=num[k2];
                sum2+=num[k2];
            }

            if(sum1-sum2<min){
                min=sum1-sum2;
                temp=div1;
            }
        }
        return temp;
    }
}
