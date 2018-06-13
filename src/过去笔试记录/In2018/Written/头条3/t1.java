package 过去笔试记录.In2018.Written.头条3;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/12.
 */
public class t1 {
    public static void main(String[] args) {
        System.out.println("\"");
        Scanner input = new Scanner(System.in);
        String temp1 = input.nextLine();
        String[] s1 = temp1.trim().split(" ");

        int n = Integer.parseInt(s1[0]);
        int m = Integer.parseInt(s1[1]);

        int []arr = new int[s1.length];
        for (int i = 0;i < s1.length;i ++) {
            arr[i] = Integer.parseInt(s1[i]);
        }

        String temp2 = input.nextLine();
        String[] s2 = temp2.trim().split(" ");

        String temp3 = input.nextLine();
        String[] s3 = temp3.trim().split(" ");

        String temp4 = input.nextLine();
        String[] s4 = temp4.trim().split(" ");

        input.close();
    }

}
