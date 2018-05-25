package 牛客真题.网易;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/24.
 * 链接：https://www.nowcoder.com/questionTerminal/49cb3d0b28954deca7565b8db92c5296
 来源：牛客网

 import java.util.Scanner;
  
 public class Main{
     public static void main(String[] args){
         Scanner in = new Scanner(System.in);
         long n = in.nextLong();
         System.out.println(s(n));
     }
      
     public static long s(long n){
         if(n==1){
             return 1;
         }
         if(n%2==0){
             return  (n/2)*(n/2) + s(n/2);
         }else{
             return  ((n+1)/2)*((n+1)/2) + s((n-1)/2);
         }
          
     }
 }
  
  
 这题巨坑，提交了四五次才通过。
 1.首先算法复杂度必须要尽可能的小，这里不能考虑枚举，而是应该以奇数偶数分治
 （考虑两个点：n为奇数和偶数时；12345678910分治成13579的和加上246810即123456的和
 ），最后采取递归的算法才可以在提交时跑的出结果。
 2.由于测试的数字有10亿级着这么大所以得用long长整型存储。
 3.Math.pow默认返回值是double型，所以强制转换成long型会丢失部分精度，在如此大级别
 的数的运算中最后的值就会有差别（所以通过不了）因此这里得用a*a代替Math.pow(a,2)
 */
public class 最大的奇数约数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        System.out.println(maxOdd(N));
    }

    public static long maxOdd (long N) {
        long sum = 0;
        for (int i = 1;i <= N;i ++) {
            if (i % 2 != 0) {
                sum += i;
            }else {
                int temp = i;
                while (temp >= 2 && temp % 2 == 0) {
                    temp = temp / 2;
                }
                sum += temp;
            }
        }
        return sum;
    }

}
