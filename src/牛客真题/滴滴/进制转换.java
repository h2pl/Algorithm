package 牛客真题.滴滴;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by 周杰伦 on 2018/5/27.
 */
public class 进制转换 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        System.out.println(convert(M, N));
    }

    public static String convert(int M, int N) {
        char []arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        int temp = M;
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        if (N <= 9) {
            int flag = 1;
            if (temp < 0) {
                flag = -1;
                temp = -temp;
            }
            while (temp > 0) {
                stack.push(temp % N);
                temp = temp / N;
            }
            while (!stack.isEmpty()) {
                res = res * 10 + stack.pop();
            }
            return String.valueOf(flag * res);
        }
        else {
            if (M < N) {
                return String.valueOf(arr[M]);
            }else {
                StringBuilder sb = new StringBuilder();
                temp = M;
                while (temp >= N) {
                    sb.append(arr[temp / N]);
                    sb.append(arr[temp % N]);
                }
                return sb.toString();
            }
        }
    }
}
