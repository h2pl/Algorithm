package practice;

import org.junit.Test;

/**
 * Created by 周杰伦 on 2017/3/10.
 */
public class resolveNum {
    void resolve(int num){
       int i,x;
        for (i=2;i<num;i++){
            if(num%i==0){

                if(isprime(num/i))
                {
                    System.out.println(num/i);
                }
                else resolve(num/i);

            }
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
        resolve(36);
    }

}
