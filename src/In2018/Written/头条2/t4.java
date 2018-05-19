package In2018.Written.头条2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int i = 0;
        int[] arrK = new int[N];
        List<List<Integer>> nums = new ArrayList<>();
        while (i < N) {
            String[] s = sc.nextLine().split(" ");
            arrK[i] = Integer.valueOf(s[0]);
            List<Integer> temp = new ArrayList<>();
            for (int m = 1; m < s.length; m++) {
                temp.add(Integer.valueOf(s[m]));
            }
            nums.add(temp);
            i++;
        }
        List<num> res = new ArrayList<>();
        for (i = 0; i < nums.size(); i++) {
            List<Integer> temp = nums.get(i);
            List<num> resTemp = new ArrayList<>();
            for (int j = 0; j < temp.size() - 1; j++) {
                for (int n = j + 1; n < temp.size(); n++) {
                    resTemp.add(new num(temp.get(j), temp.get(n)));
                }
            }
            Collections.sort(resTemp);
            res.add(resTemp.get(arrK[i] - 1));
        }
        for (num index : res) {
            System.out.println(index.x + " " + index.y);
        }
    }

    static class num implements Comparable<num> {
        public int x;
        public int y;

        public num(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(num o) {
            int son1 = this.x * o.y;
            int son2 = this.y * o.x;
            return son1 - son2;
        }
    }
}
