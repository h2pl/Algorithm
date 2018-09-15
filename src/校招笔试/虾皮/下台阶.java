package 校招笔试.虾皮;

import java.util.Scanner;


public class 下台阶 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(climbStairs(n));
    }
//    static long climbStairs(long n) {
//        if(n == 1){
//            return 1;
//        }
//        if(n == 2){
//            return 2;
//        }
//        long num1 = 1;
//        long num2 = 2;
//        for(int i = 2;i<n;i++){
//            long tmp = num1 + num2;
//            num1 = num2;
//            num2 = tmp;
//        }
//        return num2;
//    }
    public static long climbStairs(long n) {
        long a = 1, b = 1;
        while (n-- > 0)
            a = (b += a) - a;
        return a;
    }

}
