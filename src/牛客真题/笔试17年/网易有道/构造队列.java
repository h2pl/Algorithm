package 牛客真题.笔试17年.网易有道;

import java.util.*;

/**
 * Created by 周杰伦 on 2018/5/22.
 */


//    楼主的方法很巧妙,利用了逆向思维，下面我对楼主的思路做一个详细的分析
//    首先根据题目要求我们要构造的队列是这样子的,将队头的数拿到（注意是拿到）队尾，然后再弹出队头的数,这样子下去最终弹出来的序列是1到n
//    那么我们可以逆向去考虑，从结果去倒推,比如我们的n=3，最后的连续操作是将3从队头拿到队尾，然后再弹出队头3（亦是队尾，因为队列里面就一个元素了），那我们倒过来就是将3插入队头（对应弹出操作）然后将3从队尾拿到队头
//    我们再看倒数第二次连续操作是将3从队头拿到队尾，然后再弹出队头2，倒过来就是2插入队头，然后将3从队尾拿到队头
//    倒数第三次连续操作是将2从队头拿到队尾，然后再弹出队头1，倒过来就是1插入队头，然后将2从队尾拿到队头

//import java.util.LinkedList;
//import java.util.Scanner;
//    public class NewTest{
//    public static LinkedList<Integer> func(int n){
//        LinkedList<Integer> help=new LinkedList<Integer>();
//        for(int i=n;i>=1;i--){
//            help.addFirst(i);
//            help.addFirst(help.removeLast());
//        }
//        return help;
//    }
//    public static void main(String[] args){
//        int t;
//        Scanner scan = new Scanner(System.in);
//        t=scan.nextInt();
//        int n;
//        LinkedList<Integer> res;
//        while(t-->0){
//            n=scan.nextInt();
//            res=func(n);
//            for(int i=0;i<n-1;i++){
//                System.out.print(res.removeFirst()+" ");
//            }
//            System.out.println(res.removeFirst());
//        }
//    }
//    }
public class 构造队列{
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
