package Basic.practice;

/**
 * Created by 周杰伦 on 2017/3/10.
 */
public class isprime {
    boolean isprime(int x){
        for(int i=2;i<x;i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;


    }
}
