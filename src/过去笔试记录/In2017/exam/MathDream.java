package 过去笔试记录.In2017.exam;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2017/3/25.
 */
public class MathDream {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String temp0 = input.nextLine();
        int n = Integer.valueOf(temp0);
        String[] inputArr = new String[n];

        int []xi=new int[n];
        int []pi=new int[n];

        for (int i = 0; i < n; i++) {
            inputArr[i] = input.nextLine();
            xi[i]=Integer.valueOf(inputArr[i].trim().split(" ")[0]);
            pi[i]=Integer.valueOf(inputArr[i].trim().split(" ")[1]);
        }

        input.close();

        float Ex=0;
        for(int j=0;j<n;j++){
            Ex+=xi[j]*pi[j];
        }
        String result = String.format("%.3f", Ex/100);
        System.out.println(result);
    }
}