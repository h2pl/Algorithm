package exam2;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2017/3/29.
 */
public class fruit {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        String temp1 = input.nextLine();
        String[] s1 = temp1.trim().split(" ");
        int []num=new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            num[i] = Integer.parseInt(s1[i]);
        }

        int sum=input.nextInt();
        input.close();


        int min=Integer.MAX_VALUE;
        //第一种情况
        for(int i=0;i<num.length;i++){
            for(int j=1;j<=sum;j++){
                if(num[i]*j==sum && j<min) {
                    min=j;
                }
            }
        }
        //第二种情况
        for (int i = 0; i < num.length; i++) {
            int startItem=num[i];

            for (int j = 0; j <num.length; j++) {
                if(i==j)
                    continue;
                int endItem=num[j];

                if((startItem+endItem)==sum)
                    System.out.println(2);

            }

        }





        System.out.println();
    }
}
