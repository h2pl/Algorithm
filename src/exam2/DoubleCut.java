package exam2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2017/4/9.
 * 小B正处于百无聊赖中，提不起干活的兴趣。看到桌面上的一条带着方格纸带，于是随手拿起一支笔，在纸带的每个方格中写上一个随机想起的数字。然后把纸带折起来撕成两半，她突然发现两半中各个数值加起来的和竟然是一样的。小B一下子有了一点精神，她想知道可以有多少种方式把纸带撕成两半，仍然使得两边的数值之和是相等的。
 你能帮她吗！
 */
public class DoubleCut {
    public static void main(String []args) {


        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String temp = input.nextLine();
            String[] ss = temp.trim().split(" ");
            int n = Integer.parseInt(ss[0]);

            String temp1 = input.nextLine();
            String[] ss1 = temp1.trim().split(" ");
            int[] num=new int[n];

            if(n==1)System.out.println(0);

            for(int i=0;i<ss1.length;i++){
                num[i]=Integer.parseInt(ss1[i]);
            }

            int count=0;//记录撕开的方法。


            for (int j=1;j<n;j++){
                int []left=Arrays.copyOfRange(num,0,j);
                int []right=Arrays.copyOfRange(num,j,n);
                if (sum(left)==sum(right))count++;
            }
            System.out.println(count);


        }
    }

    public static int sum(int []a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
}
