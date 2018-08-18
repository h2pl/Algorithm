package 校招笔试.链家;

import java.util.*;

/**
 * Created by 周杰伦 on 2018/8/18.
 */
public class 社团预约 {

        static class Time {
            int id;
            int begin;
            int end;

            public Time(int id, int begin, int end) {
                this.id = id;
                this.begin = begin;
                this.end = end;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            List<Time> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int begin = scanner.nextInt();
                int end = scanner.nextInt();
                Time time = new Time(i + 1, begin, end);
                list.add(time);
            }
            cancel(list);
        }

        public static void cancel(List<Time> list) {
            List<Time> tmp = new ArrayList<>();
            list.sort(new Comparator<Time>() {
                @Override
                public int compare(Time o1, Time o2) {
                    return o1.begin - o2.begin;
                }
            });

            int cnt = 0;
            int flag = 0;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i - 1).end > list.get(i).begin) {
                    flag = 1;
                    List<Time> check = new ArrayList<Time>(list);
                    check.remove(i - 1);
                    if (legal(check)) {
                        if (!tmp.contains(list.get(i - 1))) {
                            tmp.add(list.get(i - 1));
                        }
                    } else {
                        check = new ArrayList<Time>(list);
                        check.remove(i);
                        if (legal(check)) {
                            if (!tmp.contains(list.get(i))) {
                                tmp.add(list.get(i));
                            }
                        }
                    }
                }
            }
            if (flag == 0) {
                list.sort(new Comparator<Time>() {
                    @Override
                    public int compare(Time o1, Time o2) {
                        return o1.id - o2.id;
                    }
                });
                System.out.println(list.size());
                for (int i = 0; i < list.size(); i++) {
                    if (i != list.size() - 1) {
                        System.out.print(list.get(i).id + " ");
                    } else {
                        System.out.print(list.get(i).id);
                    }
                }
            } else if (tmp.size() > 0) {
                System.out.println(tmp.size());
                tmp.sort(new Comparator<Time>() {
                    @Override
                    public int compare(Time o1, Time o2) {
                        return o1.id - o2.id;
                    }
                });
                for (int i = 0; i < tmp.size(); i++) {
                    if (i != tmp.size() - 1) {
                        System.out.print(tmp.get(i).id + " ");
                    } else {
                        System.out.print(tmp.get(i).id);
                    }
                }
            } else {
                System.out.println(0);
            }
        }

        public static boolean legal(List<Time> list) {
            list.sort(new Comparator<Time>() {
                @Override
                public int compare(Time o1, Time o2) {
                    return o1.begin - o2.begin;
                }
            });
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i - 1).end > list.get(i).begin) {
                    return false;
                }
            }
            return true;
        }
}
