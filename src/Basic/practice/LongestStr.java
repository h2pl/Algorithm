package Basic.practice;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2017/4/3.
 */
public class LongestStr {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        input.close();
        int maxLen=1;
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String substr=s.substring(i,j);
                for(int k=j+1;k<s.length();k++){
                    for(int x=k;x<s.length();x++){
                        String substr2=s.substring(k,x);
                        if(substr.equals(substr2)){
                            if(substr.length()>maxLen){
                                maxLen=substr.length();
                                sb.replace(0,maxLen-1,substr);
                            }

                        }
                    }
                }
            }
        }

        System.out.println(sb.toString());
    }
}
