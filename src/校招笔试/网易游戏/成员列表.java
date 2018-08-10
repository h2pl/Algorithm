package 校招笔试.网易游戏;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/8/9.
 */
public class 成员列表 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<User> list = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0;i < n;i ++) {
            int level = scanner.nextInt();
            String name = scanner.next();
            User user = new User(name, level, 0);
            list.add(user);
        }
        int m = scanner.nextInt();
        for (int i = 0;i < m;i ++) {
            String name = scanner.next();
            int op = scanner.nextInt();
            for (User user : list) {
                if (user.name.equals(name)) {
                    user.state = op;
                }
            }
        }
        printGroup(list);
    }
    static class User{
        String name;
        int level;
        int state;

        public User(String name, int level, int state) {
            this.name = name;
            this.level = level;
            this.state = state;
        }
    }
    public static void printGroup(List<User> list) {
        list.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o1.state > o2.state) {
                    return -1;
                }else if(o1.state < o2.state){
                    return 1;
                }else {
                    if(o1.level > o2.level) {
                        return -1;
                    }else if(o1.level < o2.level){
                        return 1;
                    }else {
                        return o1.name.compareTo(o2.name);
                    }
                }
            }
        });
        for (User user : list) {
            System.out.println(user.name);
        }
    }
}
