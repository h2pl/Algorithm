package In2017.exam2;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2017/4/9.
 * 一天，小明带来了一大堆巧克力，共n条且长短不一。他想分成每条都相同长度的巧克力条分给同事，但又想偷懒，于是他想知道在能均分巧克力的前提下，用最少分割次数分割后能得到的巧克力的长度是多少。
 */
public class renren {
    public static void main(String []args){

        Scanner input = new Scanner(System.in);
        String temp = input.nextLine();
        String[] num = temp.trim().split(" ");
        int n = Integer.parseInt(num[0]);
        int []len=new int[n];

        String temp1 = input.nextLine();
        String[] num1 = temp1.trim().split(" ");

        for(int i=0;i<n;i++){
            len[i]=Integer.parseInt(num1[i]);
        }
        input.close();

        int min=Integer.MAX_VALUE;
        for(int i=0;i<len.length;i++){
            if(min>len[i])min=len[i];
        }

        //标识为false时，说明最小值不能被所有长度整除.
        boolean flag=false;

        while (flag==false) {
            flag = true;

            for (int j = 0; j < len.length; j++) {
                if (len[j] % min != 0){
                    flag = false;

                }
            }
            if(flag==false)min=min/2;
        }

        System.out.println(min);

    }
}
