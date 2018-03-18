package In2017.exam2;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2017/4/7.
 * 站队
 时间限制：C/C++语言 2000MS；其他语言 4000MS
 内存限制：C/C++语言 65536KB；其他语言 589824KB
 题目描述：
 有一条很长的队伍，队伍里面一共有n个人。所有的人分为三类：警察，小偷和普通人。将队伍里面的人从前到后由1到n编号，编号为i的人与编号为j的人的距离为i与j之差的绝对值。
 每一个警察有一个能力值x，表示他能够监视与他距离不超过x的所有人，小偷被警察发现当且仅当他被一个或多个警察监视到。你知道在整条队伍中，一共有多少个小偷会被警察发现吗？
 */
public class PoliceAndThief {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String temp = input.nextLine();
        String[] num = temp.trim().split(" ");
        int n = Integer.parseInt(num[0]);

        String str = input.nextLine();
        char[] ss = str.toCharArray();
        input.close();
        int count=0;
        boolean flag=false;
        for(int i=0;i<ss.length;i++){

            if(ss[i]=='X'){
                flag=false;
               for(int j=0;j<ss.length;j++){
                   if(1<=Character.getNumericValue(ss[j]) && Character.getNumericValue(ss[j])<=9){
                       if(Character.getNumericValue(ss[j])>=Math.abs(j-i)){
                          flag=true;
                       }
                   }
               }
               if(flag)count++;
            }
        }
        System.out.println(count);




    }
}
