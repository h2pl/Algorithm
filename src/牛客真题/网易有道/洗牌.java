package 牛客真题.网易有道;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/22.
 */
public class 洗牌 {


    /**
      * 每次读取一个数之后，算出他经过k次洗牌后的位置，只用一个长度为2n数组用来输出
      * 根据当前数的位置，可以算出经过一次洗牌后的位置
      * 如果当前数小于等于n（即在左手），则他下次出现的位置是 2*当前位置-1
      * 如果当前位置大于n（即在右手）,则他下次出现的位置是 2*（当前位置 - n）
      * 个人建议在线面试题的时候如果5分钟内没想到好方法建议就使用暴力方法，
      * 毕竟测试用例不通过什么都没用
      * Created by lizo on 2016/8/20.
      */
//    public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int groups = sc.nextInt();
//        while (groups-- > 0){
//            int n = sc.nextInt();
//            int k = sc.nextInt();
//            int[] res = new int[2*n];
//            for(int i=0;i<2*n;i++){
//                int tmp = i + 1;
//                for(int j = 0; j < k;j++){
//                    if (tmp <= n) tmp = 2*tmp - 1;
//                    else tmp = 2 * (tmp - n);
//                }
//                res[tmp - 1]=sc.nextInt();
//            }
//             //输出
//            if(res.length> 0) System.out.print(res[0]);
//            for(int i = 1;i< 2*n;i++){
//                System.out.print(" "+res[i]);
//            }
//            System.out.println();
//        }
//    }
//    }
    //int的最大值是21亿，本题用例最大值是10亿，所以不用long
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0;i < T;i ++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int []arr = new int[2 * n];
            for (int j = 0;j < 2 * n;j ++) {
                arr[j] = scanner.nextInt();
            }
            for (int j = 0;j < k;j ++) {
                wash(arr, n);
            }
            for (int j = 0;j < 2 * n;j ++) {
                if (j == 2 * n - 1) System.out.println(arr[j]);
                else System.out.println(arr[j] + " ");
            }
        }
        scanner.close();
    }

    public static void wash(int []arr,int n) {
        int []left = new int[n];
        int []right = new int[n];
        for (int i = 0;i < n;i ++) {
            left[i] = arr[i];
        }
        for (int i = n;i < arr.length;i ++) {
            right[i - n] = arr[i];
        }
        int l = n - 1;
        int r = n - 1;
        for (int i = 0;i < 2 * n;i ++) {
            if (i % 2 == 0) {
                arr[i] = right[r --];
            }else {
                arr[i] = left[l --];
            }
        }
        return;
    }
}
