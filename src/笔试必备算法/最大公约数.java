package 笔试必备算法;

/**
 * Created by 周杰伦 on 2018/6/6.
 */
public class 最大公约数 {

    public static void main(String[] args) {

        int a = 30, b = 25;//a 是分母
        int gcd = gcd(a,b);
        System.out.println( b/gcd + "/" + a/gcd); //   输出了   5/6
    }
    public static int gcd(int x, int y){ // 这个是运用辗转相除法求 两个数的 最大公约数  看不懂可以百度                                                        //    下
        if(y == 0)
            return x;
        else
            return gcd(y,x%y);
    }
}
