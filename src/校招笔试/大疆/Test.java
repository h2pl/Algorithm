package 校招笔试.大疆;

import java.util.*;

/**
 * Created by 周杰伦 on 2018/7/6.
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(judgeSquareSum(11));
    }
    public static boolean judgeSquareSum(int c) {
        double n = Math.sqrt(c);
        for (double i = 0;i <= n;i ++) {
            double diff = c - i * i;
            int j = (int) Math.sqrt(diff);
            if (j * j == diff) {
                return true;
            }
        }
        List<String> list = new ArrayList<>();
        Collections.sort(list, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        return false;

    }


}
