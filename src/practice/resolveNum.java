package practice;

import org.junit.Test;

/**
 * Created by 周杰伦 on 2017/3/10.
 */
public class resolveNum {
    void resolve(int num){
       int i;
        for (i=2;i<num;i++){
            while (num%i==0){
                System.out.println(i);
                num=num/i;
            }
        }
            if(num!=1){
                System.out.println(num);
            }


    }

    boolean isprime(int x){
        for(int i=2;i<x;i++) {
            if (x % i == 0) {
                return false;
            }
        }
            return true;


    }
    @Test
    public void test(){
        resolve(144);
    }

}
