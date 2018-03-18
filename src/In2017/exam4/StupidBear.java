package In2017.exam4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2017/4/27.
 */
public class StupidBear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String temp = input.nextLine();
        String[] ss = temp.trim().split(" ");
        int n = Integer.parseInt(ss[0]);
        String temp2 = input.nextLine();
        String[] ss2 = temp2.trim().split(" ");

        int []num=new int[n];
        for(int i=0;i<ss2.length;i++){
            num[i]=Integer.parseInt(ss2[i]);
        }
        int[] num1=Arrays.copyOfRange(num,0,n-1);
        int num2=num[n-1];

        int min=Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<num1.length;i++){
           if(num1[i]<min){
               min=num1[i];
               index=i;
           }
        }
        int tep=num1[index];
        if(min<num2){

        }
    }
}
