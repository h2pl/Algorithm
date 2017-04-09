package exam2;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2017/4/9.
 * 在大年三十的晚上，小明不想看春晚，就在网上报名了一场网络程序设计比赛，比赛将于20:00开始，持续4个小时，之到午夜。比赛中会有n个问题，按照难度排序，也就是说，第一个问题是最简单的，最后一个问题是最难的。小明知道他解决第k个问题需要k * 5分钟。小明的父母允许小明不看春晚，但要求他必须参加跨年，就是小明必须在12.00或者12.00之前赶到客厅和父母一起跨年。他需要m分钟从房间走到客厅。请问，小明在去参加跨年之前最多能解决多少问题。
 */
public class xiaomingzuoti {
    public static void main(String []args) {

        Scanner input = new Scanner(System.in);
        String temp = input.nextLine();
        String[] num = temp.trim().split(" ");
        int n = Integer.parseInt(num[0]);

        String temp1 = input.nextLine();
        String[] num1 = temp1.trim().split(" ");
        int m = Integer.parseInt(num1[0]);

        input.close();

        int time=240-m;

        int k=1;//做到第k道题
        int usetime=0;//已使用时间
        while (usetime<time){
            usetime+=k*5;
            if(usetime<time &&k<n)
            k++;
            else break;
        }

        System.out.println(k);
    }
}
