package 校招笔试.链家;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/8/18.
 */
public class 修路 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int i=0;
            int []arr = new int[n];
            while(i<n){
                arr[i]=sc.nextInt();
                i++;
            }
            int min = Integer.MAX_VALUE;
            int sum =0;
            for(int j=0;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                }
                sum+=arr[j];
            }
            System.out.println(sum-min);
        }

}
