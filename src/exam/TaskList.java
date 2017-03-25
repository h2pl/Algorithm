package exam;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2017/3/25.
 */
public class TaskList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String temp = input.nextLine();
        String[] ss = temp.trim().split(" ");

        int N = Integer.parseInt(ss[0]);
        int M = Integer.parseInt(ss[1]);

        int[] Ti = new int[N];
        int[] Qi = new int[M];
        String s1 = input.nextLine();
        String[] temp1 = s1.trim().split(" ");
        for(int i = 0; i < N; i++){
            Ti[i] = Integer.valueOf(temp1[i]);
        }


        for(int i = 0; i < M; i++){
            Qi[i] = input.nextInt();
        }

        input.close();

        int []QTime=new int[M];
        for (int i=0;i<M;i++){
            QTime[i]=Ti[N-1]+1;
        }

        for (int i=0;i<M;i++){
           if(Ti[0]>Qi[i]){
               QTime[i]=Qi[i];
           }
        }

        for (int i=0;i<M;i++){
            for(int j=0;j<N-1;j++){
               if(Ti[j+1]-Ti[j]>1){
                   if(Qi[i]<Ti[j+1] && QTime[i]>Ti[j]+1){
                       QTime[i]=Ti[j]+1;
                   }
               }
            }
        }

        for(int k=0;k<M;k++){
          System.out.print(QTime[k]);
            if(k!=M+1)System.out.println();
        }
    }
}
