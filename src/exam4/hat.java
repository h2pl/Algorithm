package exam4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2017/4/27.
 */
public class hat {
    public static void main(String []args) {

        Scanner input = new Scanner(System.in);
        String temp = input.nextLine();
        String[] ss = temp.trim().split(" ");
        int n = Integer.parseInt(ss[0]);
        String temp2 = input.nextLine();
        String[] ss2 = temp2.trim().split(" ");

        int []num=new int[n];
        for(int i=0;i<ss2.length;i++){
            num[i]=Integer.parseInt(ss2[i]);
        }
        Arrays.sort(num);

        List<Integer> list = new ArrayList<>();
        for (int i=0; i<num.length; i++) {
            if(!list.contains(num[i])) {
                list.add(num[i]);
            }
        }

        if(list.size()<3)System.out.println(-1);
        else System.out.println(list.get(2));

    }
}
