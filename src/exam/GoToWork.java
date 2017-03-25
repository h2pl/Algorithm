package exam;

import org.junit.Test;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2017/3/25.
 */
public class GoToWork {

    public static int MinTime(int n,int[]tX,int []tY,int walkTime,int taxiTime,int gx,int gy){
        if(gx==0 && gy==0)return 0;
        int min=(Math.abs(gx)+Math.abs(gy))*walkTime;
        int temp=0;
        for(int i=0;i<n;i++){
           temp=(Math.abs(tX[i])+Math.abs(tY[i]))*walkTime+(Math.abs(gx-tX[i])+Math.abs(gy-tY[i]))*taxiTime;
            if(temp<min)min=temp;
        }
        return min;


    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String temp0 = input.nextLine();


        int n=Integer.valueOf(temp0);
        int []tX=new int[n];
        int []tY=new int[n];

        String temp1 = input.nextLine();
        String[] s1 = temp1.trim().split(" ");
        for(int i=0;i<n;i++){
        tX[i]= Integer.parseInt(s1[i]);
        }

        String temp2 = input.nextLine();
        String[] s2 = temp2.trim().split(" ");
        for(int i=0;i<n;i++){
            tY[i]= Integer.parseInt(s2[i]);
        }

        String temp3 = input.nextLine();
        String[] s3 = temp3.trim().split(" ");
        int gx=Integer.valueOf(s3[0]);
        int gy=Integer.valueOf(s3[1]);

        String temp4 = input.nextLine();
        String[] s4 = temp4.trim().split(" ");
        int walkTime=Integer.valueOf(s4[0]);
        int taxiTime=Integer.valueOf(s4[1]);
        input.close();

        System.out.println(MinTime(n,tX,tY,walkTime,taxiTime,gx,gy));
    }

}
