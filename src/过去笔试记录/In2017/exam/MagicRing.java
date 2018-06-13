package 过去笔试记录.In2017.exam;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2017/3/25.
 */
public class MagicRing {
    public static void MagicRing(int[] num, int k){

        int first;
        for(int j=1;j<=k;j++){
            first=num[0];
            for(int i=0;i<num.length;i++){
                if(i!=num.length-1){
                    num[i]+=num[i+1];
                    if(num[i]>=100)
                        num[i]=num[i]%100;
                }
                else {
                    num[i]+=first;
                    if(num[i]>=100)
                        num[i]=num[i]%100;
                }
            }
        }


    }

    public static void main(String[] args) {
        System.out.println("请输入两个数字，中间用空格隔开，例如5 5");
        Scanner input = new Scanner(System.in);
        String temp = input.nextLine();
        String[] ss = temp.trim().split(" ");

        int n = Integer.parseInt(ss[0]);
        int k = Integer.parseInt(ss[1]);

        int[] inputArr = new int[n];
        for(int i = 0; i < n; i++){
            inputArr[i] = input.nextInt();
        }

        input.close();

        MagicRing(inputArr,k);
        for(int i=0;i<inputArr.length;i++){
            System.out.print(inputArr[i]);
            if(i!=inputArr.length-1){
            System.out.print(" ");
            }
        }
    }
}
