package 过去笔试记录.In2017.exam;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2017/3/23.
 */
public class CategoryStr {
    public static int CategoryStr(int N){
        String []str=new String[N];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<N;i++){

            str[i]=scanner.next();
            System.out.println(str[i]);
        }
        scanner.close();

        System.out.println(str);
        return 1;
    }

    public void input(){
        Scanner in = new Scanner(System.in);
        String[] input = new String[26];
        int i = 0;
        do {
            input[i] = in.next();
            i++;
        } while (!input[i - 1] .equals("end") );
        in.close();
    }

    public static void main(String []args){
      CategoryStr(3);
    }

}
