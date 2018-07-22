package 校招笔试.拼多多;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/7/22.
 */
public class 复制可乐 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        run(n);
    }
    public static void run(int n) {
        int cnt = 1;
        int base = 4;
        int sum = 4;
        while (sum < n) {
            sum += sum * 2;
            cnt *= 2;
        }
        int diff = sum - n;
        int res = diff / cnt;
        int rem = diff % cnt;
        res += rem;
        if (rem == 1) {
            System.out.println("Alice");
        } else if (rem == 2) {
            System.out.println("Bob");
        } else if (rem == 3) {
            System.out.println("Cathy");
        } else if (rem == 4) {
            System.out.println("Dave");
        }
    }
    public static String copy(Queue<String> queue, int n) {
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Cathy");
        queue.add("Dave");
        int cnt = 1;
        while (cnt < n) {
            String s = queue.poll();
            cnt ++;
            queue.add(s);
            queue.add(s);
        }
        return queue.peek();
    }
}
