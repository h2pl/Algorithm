package 校招笔试.爱奇艺;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/9/15.
 */
public class 食物 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int m=sc.nextInt();
            int p=sc.nextInt();
            int i=0;
            sc.nextLine();
            int[]arr= new int[n];
            while(i<n){
                arr[i]=sc.nextInt();
                i++;
            }
            sc.nextLine();
            for (;i < n;i ++){
                String s=sc.nextLine();
                String[]strs=s.split(" ");
                if(strs[0].equals("A")){
                    arr[Integer.valueOf(strs[1])-1]++;
                }else{
                    arr[Integer.valueOf(strs[1])-1]--;
                }
            }
            int res=arr[p-1];
            int count=1;
            for(i=0;i<arr.length;i++){
                if(arr[i]>res){
                    count++;
                }
            }
            System.out.println(count);
        }


}
