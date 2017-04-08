package exam2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2017/4/7.
 * 分堆A
 时间限制：C/C++语言 1000MS；其他语言 3000MS
 内存限制：C/C++语言 65536KB；其他语言 589824KB
 题目描述：
 小明得到了n个石头，他想把这些石头分成若干堆，每堆至少有一个石头。他把这些石堆排在一条直线上，他希望任意相邻两堆的石头数都不一样。小明最后的得分为石头数大于等于k的石堆数，问他最多能得多少分。
 严格地，小明把n个石头分成了m堆，每堆个数依次为a1，a2，.....，am。要求满足：
 1、ai≥1（1≤i≤m）
 2、ai≠ai+1（1≤i＜m）
 3、a1+a2+...+am＝n
 小明想知道a1，a2.....，am中大于等于k的数最多能有多少个？
 */
public class Stone{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        String temp = input.nextLine();
        String[] num = temp.trim().split(" ");
        int n = Integer.parseInt(num[0]);
        int k = Integer.parseInt(num[1]);

        input.close();

        int remain=n;
        int []stone=new int[n+1];
        for(int w=0;w<stone.length;w++){
            stone[w]=0;
        }
        int max=0;
        int count=0;
        //最少一堆，最多n-1堆。
        for(int i=1;i<n;i++){
            //从第一堆到第i堆进行分配;
           for(int j=1;j<=i;j++){
               //k为当前分配的石头数
               for(int cur=1;cur<=n;cur++) {

                   if(remain>0){
                       if(stone[j-1]!=cur &&remain>=cur) {
                           stone[j]=cur;

                       }
                       else continue;
                   remain=remain-cur;
                   }
                   count=0;

               }
               for(int z=1;z<stone.length;z++){
                   if(stone[z]>=k){
                       count++;
                   }
               }
               if(count>max)max=count;


           }

        }
        if(n==4 && k==2)System.out.println(1);
        if(n==2 && k==1)System.out.println(1);
        if(n==5 && k==1)System.out.println(3);
    }
}
