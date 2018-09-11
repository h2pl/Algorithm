package 校招笔试.oppo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by 周杰伦 on 2018/9/10.
 */
public class 随机逆序排序 {
    public void random(){
        Random r = new Random();

        List<Integer> list = new ArrayList<Integer>();
        int i;
        while(list.size() < 10){
            i = r.nextInt(50);
            StringBuilder sb = new StringBuilder(String.valueOf(i)).reverse();
            int ii = Integer.parseInt(sb.toString());
            if(!list.contains(ii)){
                list.add(ii);
            }
        }
        Collections.sort(list);
    }

    public static void main(String[] args) {
//        System.out.println(foo(666,5));
        System.out.println(fun(21));
    }
    public static int foo(int x,int y) {
        if (x<=0||y<=0)return 1;
        return 3*foo(x-1,y/2);

    }
    public static int fun(int a) {
        a = (1<<5) - 1;
        return a;
    }
}
