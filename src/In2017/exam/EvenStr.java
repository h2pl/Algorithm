package In2017.exam;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2017/3/25.
 */
public class EvenStr {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String temp0 = input.nextLine();
        int len=temp0.length();
        char []str=new char[len];
        for(int i=0;i<len;i++){
            str[i]=temp0.charAt(i);
            System.out.print(str[i]);
        }

        int []evenStr=new int[len+1];
        int count=0;
        for(int i=1;i<=len;i++){
            for(int j=0;j<len;j++){
                String sb=temp0.substring(j,j+i);
                if(iseven(sb)){
                    count++;

                }
            }
        }
        System.out.println(count);

    }
    public static boolean iseven(String str){
        char []a=str.toCharArray();
        char temp;int count=0;
        for(int i=0;i<str.length();i++){
            temp= a[i];
            for(int j=0;j<str.length();j++){
               if(a[i]==a[j] && i!=j){
                  count++;
               }
               if (count!=2)return false;
            }
        }
        return true;
    }
}
