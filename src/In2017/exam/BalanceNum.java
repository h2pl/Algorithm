package In2017.exam;

import org.junit.Test;

/**
 * Created by 周杰伦 on 2017/3/23.
 * int[] a = new int[s.length()];
 for(int i = 0; i < s.length(); i++)
 {
 //先由字符串转换成char,再转换成String,然后Integer

 a[i] = Integer.parseInt( String.valueOf(s.charAt(i)));

 }
 */
public class BalanceNum {
     public String BalanceNum(int num){
           String number=String.valueOf(num);

           if(number.length()==1)return "NO";
           if(NumMulti(number))return "YES";
           return "NO";

     }

     public boolean NumMulti(String num){
         if(num==null)return false;
         int mid;
         int left=1,right=1;
         int []arr=new int[num.length()];
         for(int i=0;i<num.length();i++){
             arr[i]=Integer.parseInt(String.valueOf(num.charAt(i)));
         }

         for(mid=1;mid<arr.length-1;mid++) {
             for (int j = 0; j <= mid; j++) {
                 left *= arr[j];
             }
             for (int k = mid+1; k < arr.length; k++) {
                 right *= arr[k];
             }
             if (left == right) return true;
         }
         return false;
     }
     @Test
     public void test(){
       System.out.println(BalanceNum(3443));
     }
}
