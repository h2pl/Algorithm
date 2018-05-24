package 牛客真题.网易有道;

import java.util.*;

/**
 * Created by 周杰伦 on 2018/5/22.
 */
public class 构造队列 {
    //错误
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int T = Integer.parseInt(line);
        for (int i = 0;i < T;i ++) {
            line = scanner.nextLine();
            int n = Integer.parseInt(line);
            initialQueue(n);
        }
        scanner.close();
    }
    public static void initialQueue(int n) {
        //反向操作一波，原本是：队头元素移到队尾，打印新队头并弹出。
        //现在是，队尾元素移到队头，打印新队尾，并弹出。
        int []arr = new int[n];
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0;i < n;i ++) {
            arr[i] = i + 1;
            queue.add(i + 1);
        }
        int i = 1;
        while (i <= n) {
            queue.addLast(queue.removeFirst());
            System.out.println(queue.getFirst() + " ");
            queue.removeFirst();
            i ++;
        }

        //123
        //213
        //3 ,3 1 2,2 。3 1，1 3, 3,1
       //打印 2 3 1
        //1取队头值x，弹出队头x，x放入队尾,取新的队头值y 打印y,弹出此时的队头y,再次循环
        //1 2 3 4 5
        //5 5 ->5 1 2 3 4 ,4 4 out,5 1 2 3,3 ,3 5 1 2, 2,3 5 1
        //1 ，1 3 5，5, 1 3,3 1, 1, 3.
        //打印4 2 5 1 3
    }

}
