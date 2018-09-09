package 校招笔试.第四范式;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/9/9.
 */
public class 字符串相乘 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        System.out.println(mul(a, b));
    }

    public static String mul(String n1,String n2){
        int len1=n1.length();
        int len2=n2.length();
        char[] num1=n1.toCharArray();
        char[] num2=n2.toCharArray();
        char temp;
        int temp1;
        for(int i=0;i<len1/2;i++){
            temp=num1[i];
            num1[i]=num1[len1-1-i];
            num1[len1-1-i]=temp;
        }
        for(int i=0;i<len2/2;i++){
            temp=num2[i];
            num2[i]=num2[len2-1-i];
            num2[len2-1-i]=temp;
        }
        int[] result=new int[len1+len2];
        for(int i=0;i<len1;i++){
            for (int j=0;j<len2;j++){
                result[i+j]+=(Integer.valueOf(num1[i])-'0')*(Integer.valueOf(num2[j])-'0');
            }
        }
        for(int i=0;i<len1+len2-1;i++){
            if(result[i]>=10){
                result[i+1]+=result[i]/10;
                result[i]%=10;
            }
        }
        for(int i=0;i<(len1+len2)/2;i++){
            temp1=result[i];
            result[i]=result[len1+len2-1-i];
            result[len1+len2-1-i]=temp1;
        }

        StringBuilder resultString=new StringBuilder();
        int k=0;
        while(result[k]==0){
            k++;
        }
        for(int i=k;i<len1+len2;i++){
            resultString.append(result[i]);
        }
        return resultString.toString();
    }
}
