package 校招笔试.美团;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/9/6.
 */
public class 小明考试 {

        static class Work {
            int i;
            int p;
            int a;
            int q;
            int b;

            public Work(int i, int p, int a, int q, int b) {
                this.i = i;
                this.p = p;
                this.a = a;
                this.q = q;
                this.b = b;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            List<Work> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                int p = scanner.nextInt();
                int a = scanner.nextInt();
                int q = scanner.nextInt();
                int b = scanner.nextInt();
                Work work = new Work(i, p, a, q, b);
                list.add(work);
            }
            test(list);
        }

        static int max = 0;

        public static void test(List<Work> works) {
            max = 0;
            int[] visit = new int[works.size()];
            dfs(0, works, 0, visit);
            System.out.println(max);
        }

        public static void dfs(int time, List<Work> works, int cnt, int[] visit) {
            if (time > 120) {
                return;
            } else if(time == 120) {
                max = Math.max(cnt, max);
                return;
            }else {
                max = Math.max(cnt, max);
            }
            for (int i = 0; i < works.size(); i++) {
                if (visit[i] == 0) {
                    visit[i] = 1;
                    dfs(time + works.get(i).p, works, cnt + works.get(i).a, visit);
                    dfs(time + works.get(i).q, works, cnt + works.get(i).b, visit);
                    visit[i] = 0;
                }
            }
        }

}
