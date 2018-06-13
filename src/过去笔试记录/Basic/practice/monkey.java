package 过去笔试记录.Basic.practice;

import org.junit.Test;

/**
 * Created by 周杰伦 on 2017/3/10.
 */
public class monkey {

    int peach(int n){
        if(n==1)return 1;
        else return 2*peach(n-1)+2;
    }
    @Test
    public void test(){
        System.out.println(peach(10));
    }
}
