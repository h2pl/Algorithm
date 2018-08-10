package 校招笔试.网易游戏;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/8/9.
 */
public class 个税缴纳 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double []arr = new double[n];
        for(int i = 0; i < n; i++){
            double money = sc.nextInt();
            arr[i] = money;
        }
        for (double i : arr) {
            System.out.println(Math.round(tax(i)));
        }

    }
    public static double tax(double money) {
        double sum = 0;
        double bar = 5000;
        if (money <= bar) {
            return sum;
        }else if (money - bar <= 3000) {
            sum += (money - bar) * 0.03;
            return sum;
        }else if (money - bar <= 12000) {
            sum += 3000 * 0.03 + (money - bar - 3000) * 0.1;
            return sum;
        }else if (money - bar <= 25000) {
            sum += 3000 * 0.03 + 9000 * 0.1 + (money - bar - 12000) * 0.2;
            return sum;
        }else if (money - bar <= 35000) {
            sum += 3000 * 0.03 + (12000 - 3000) * 0.1 + (25000 - 12000) * 0.2
            + (money - bar - 25000) * 0.25;
            return sum;
        }else if (money - bar <= 55000) {
            sum += 3000 * 0.03 + (12000 - 3000) * 0.1 + (25000 - 12000) * 0.2
            + (35000 - 25000) * 0.25 + (money - bar - 35000) * 0.3;
            return sum;
        }else if (money - bar <= 80000) {
            sum += 3000 * 0.03 + (12000 - 3000) * 0.1 + (25000 - 12000) * 0.2
                    + (35000 - 25000) * 0.25 + (55000 - 35000) * 0.3 + (money - bar - 55000) * 0.35;
            return sum;
        }else {
            sum += 3000 * 0.03 + (12000 - 3000) * 0.1 + (25000 - 12000) * 0.2
                    + (35000 - 25000) * 0.25 + (55000 - 35000) * 0.3 + (80000 - 55000) * 0.35
                    + (money - bar - 80000) * 0.45;
            return sum;
        }
    }

}
