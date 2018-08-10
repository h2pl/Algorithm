package 校招笔试.网易游戏;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by 周杰伦 on 2018/8/9.
 */
public class 时间区间 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, List<String>> map = new HashMap<>();
        int T = scanner.nextInt();
        for (int i = 0;i < T;i ++) {
            int K = scanner.nextInt();
            for (int j = 0;j < K;j ++) {
                int W = scanner.nextInt();
                int M = scanner.nextInt();
                for (int k = 0;k < M;k ++) {
                    String time = scanner.next();
                    if (map.containsKey(W)) {
                        map.put(W, new ArrayList<>());
                        map.get(W).add(time);
                    }else {
                        map.get(W).add(time);
                    }
                }
            }
            int C = scanner.nextInt();
            String[][] s = new String[C][2];
            for (int w = 0;w < C;w ++) {
                s[w][0] = scanner.next();
                s[w][1] = scanner.next();
            }
            for (int w = 0;w < C;w ++) {
                System.out.println(nextTime(map, Integer.parseInt(s[w][0]), s[w][1]));
            }
        }

    }
    public static long nextTime(HashMap<Integer, List<String>> map, int day, String now) throws ParseException {
        long wait = Long.MAX_VALUE;
        SimpleDateFormat sDateFormat = new SimpleDateFormat("HH:mm:ss");
        Date nowtime = sDateFormat.parse(now);
        List<String> times = new ArrayList<>();
        int newday = 0;
        if (map.containsKey(day)) {
            times = map.get(day);
        }else {
            for (int i = 1;i < 7;i ++) {
                if (map.containsKey((day + i) % 7)){
                    times = map.get((day + i) % 7);
                    newday = day + i;
            }
        }
            for (String time : times) {
                String []s = time.split("-");
                Date begin = sDateFormat.parse(s[0]);
                Date end = sDateFormat.parse(s[1]);
                int days = newday - day;
                if (nowtime.after(begin) && nowtime.before(end)) {
                    long interval = (nowtime.getTime() - begin.getTime())/1000;
                    if (day == newday) {
                        wait = 0;
                        return wait;
                    }else {
                        wait = Math.min(wait, days * 24 * 60 * 60 - interval);
                    }
                }else if (nowtime.before(begin)) {
                    long interval = (begin.getTime() - nowtime.getTime())/1000;
                    wait = Math.min(wait, days * 24 * 60 * 60 + interval );
                }else {
                    long interval = (nowtime.getTime() - begin.getTime())/1000;
                    wait = Math.min(wait, days * 24 * 60 * 60 - interval );
                }
            }
        }
        return wait;
    }
}
