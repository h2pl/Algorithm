package In2018.Written.百度;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/4/18.
 */
public class testlong {
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

        input.close();
        work(num1, arr);
    }

    public static void work(long a,long []arr) {
        System.out.println();
    }
}
