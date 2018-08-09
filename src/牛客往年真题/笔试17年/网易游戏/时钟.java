package 牛客往年真题.笔试17年.网易游戏;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/8/9.
 * 小W有一个电子时钟用于显示时间，显示的格式为HH:MM:SS，HH，MM，SS分别表示时，分，秒。其中时的范围为[‘00’,‘01’…‘23’]，分的范围为[‘00’,‘01’…‘59’]，秒的范围为[‘00’,‘01’…‘59’]。

 但是有一天小W发现钟表似乎坏了，显示了一个不可能存在的时间“98:23:00”，小W希望改变最少的数字，使得电子时钟显示的时间为一个真实存在的时间，譬如“98:23:00”通过修改第一个’9’为’1’，即可成为一个真实存在的时间“18:23:00”。修改的方法可能有很多，小W想知道，在满足改变最少的数字的前提下，符合条件的字典序最小的时间是多少。其中字典序比较为用“HHMMSS”的6位字符串进行比较。


 输入描述:
 每个输入数据包含多个测试点。每个测试点后有一个空行。 第一行为测试点的个数T(T<=100)。 每个测试点包含1行，为一个字符串”HH:MM:SS”，表示钟表显示的时间。


 输出描述:
 对于每个测试点，输出一行。如果钟表显示的时间为真实存在的时间，则不做改动输出该时间，否则输出一个新的”HH:MM:SS”，表示修改最少的数字情况下，字典序最小的真实存在的时间。

 输入例子1:
 2
 19:90:23
 23:59:59

 输出例子1:
 19:00:23
 23:59:59
 */
public class 时钟 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[]s = new String[n];
        for (int i = 0;i < n;i ++) {
            s[i] = scanner.next();
        }
        for (int i = 0;i < n;i ++){
            print(s[i]);
        }
    }
    static class Time{
        String hour;
        String min;
        String sec;
    }
    public static void print(String s) {
        String[]ss = s.split(":");
        Time time = new Time();
        time.hour = ss[0];
        time.min = ss[1];
        time.sec = ss[2];
        time = findTime(time);
        System.out.println(time.hour + ":" + time.min + ":" + time.sec);
    }
    public static Time findTime(Time time) {
        if (Integer.parseInt(time.hour) > 23 || Integer.parseInt(time.hour) < 0) {
            time.hour = "0" + time.hour.charAt(1);
        }
        if (Integer.parseInt(time.min) > 59 || Integer.parseInt(time.min) < 0) {
            time.min = "0" + time.min.charAt(1);
        }
        if (Integer.parseInt(time.sec) > 59 || Integer.parseInt(time.sec) < 0) {
            time.sec = "0" + time.sec.charAt(1);
        }
        return time;
    }

}
