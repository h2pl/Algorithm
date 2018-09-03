package 校招笔试.拼多多.第二波;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/8/30.
 */
public class 回合制游戏 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int cnt = k / m;
        if(cnt >= 2){
            int size = n / k;
            if(n % k <= m){
                System.out.println(size * 2 + 1);
            }else{
                System.out.println(size * 2 + 2);
            }
        }else{
            System.out.println(n / m + 1);
        }
    }
}
