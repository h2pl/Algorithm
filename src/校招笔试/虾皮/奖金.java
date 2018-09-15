package 校招笔试.虾皮;


/**
 * Created by 周杰伦 on 2018/9/15.
 */
import java.util.Scanner;

public class 奖金 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        double gain = tax(money);
        System.out.println(String.format("%.2f", gain));
    }

    public static double tax(double money) {
        double sum = 0;
        if (money <= 100000) {
            sum = money * 0.1;
            return sum;
        }else if (money <= 200000) {
            sum = 100000 * 0.1 + (money - 100000) * 0.075;
            return sum;
        }else if (money <= 400000) {
            sum = 100000 * 0.1 + 100000 * 0.075 + (money - 200000) * 0.05;
            return sum;
        }else if (money <= 600000) {
            sum = 100000 * 0.1 + 100000 * 0.075 + 200000 * 0.05 + (money - 400000) * 0.03;
            return sum;
        }else if (money <= 1000000) {
            sum = 100000 * 0.1 + 100000 * 0.075 + 200000 * 0.05 + 200000 * 0.03 + (money - 600000) * 0.015;
            return sum;
        }else {
            sum = 100000 * 0.1 + 100000 * 0.075 + 200000 * 0.05 + 200000 * 0.03 + 400000 * 0.015 + (money - 1000000) * 0.01;
            return sum;
        }
    }
}
