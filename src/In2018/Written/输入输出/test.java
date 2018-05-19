package In2018.Written.输入输出;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/4/18.
 */
public class test {
    public static void main(String[] args) {

        System.out.println();

        //读取一个数
        Scanner input = new Scanner(System.in);
        String line1 = input.nextLine();
        String[] s1 = line1.trim().split(" ");
        long num1 = Long.parseLong(s1[0]);

        //读取一行的数
        String line2 = input.nextLine();
        String[] s2 = line2.trim().split(" ");

        //将一行的数存入数组
        long []arr = new long[s2.length];
        for (int i = 0;i < arr.length;i ++) {
            arr[i] = Long.parseLong(s2[i]);
        }

        //读取n行,每行一个数。
        for (int i = 0;i < num1;i ++) {
            String line = input.nextLine();
            String[] s = line.trim().split(" ");
            long n = Long.parseLong(s[0]);
        }

        //读取n行的多个数并存入数组。
        for (int i = 0;i < num1;i ++) {
            String line = input.nextLine();
            String[] s = line.trim().split(" ");
            int []temp = new int[s.length];
            for (int j = 0;j < temp.length;j ++) {
                temp[j] = Integer.parseInt(s[j]);
            }
            //pass
        }
        input.close();
    }

    public void work(int a,int []arr) {
        System.out.println();
    }
}
