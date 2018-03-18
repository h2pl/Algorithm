package Basic.practice;

import org.junit.Test;

/**
 * Created by 周杰伦 on 2017/3/10.
 */
public class GcdAndLcm {
    int Lcm(int x,int y)
    {
        if(x>0 && y>0) {
            int m, n, odd;
            m=Math.max(x,y);
            n=Math.min(x,y);
            m = x > y ? x : y;
            n = x < y ? x : y;
            odd = m % n;
            if (odd != 0) {
                m = n;
                n = odd;
                return Lcm(m, n);
            } else return n;
        }
        else return 0;
    }

    int Gcd(int x,int y){
        return x*y/Lcm(x,y);
    }

    @Test
    public void test(){
        System.out.println(Lcm(4,99));
        System.out.println(Gcd(6,21));
    }

}
