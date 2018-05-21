package 牛客真题.网易;

import java.util.*;

/**
 * Created by 周杰伦 on 2018/5/20.
 */
public class 幸运袋子 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int n = Integer.parseInt(line);
        line = scanner.nextLine();
        String[] s= line.split(" ");
        int []arr = new int[n];
        for (int i = 0; i < n ;i ++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int []cnt = new int[1];
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        dfs(arr, 0, list, cnt);
        System.out.println(cnt[0]);
    }

    public static boolean lucky(List<Integer> list) {
        if (list.size() == 0)return false;
        int sum = 0;
        int product = 1;
        for (int i = 0;i < list.size();i ++) {
            sum += list.get(i);
            product *= list.get(i);
        }
        return sum > product;
    }

    public static List<List<Integer>> sumList = new ArrayList<>();
    public static boolean duplicate(List<Integer> list) {
        for (List<Integer> list1 : sumList) {
            if (list.size() == list1.size()) {
                int flag = 1;
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) == list1.get(i)) {
                        continue;
                    }else {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1)return true;
            }
        }
        return false;
    }

    //超时
    public static void dfs (int []arr, int cur, ArrayList list, int []cnt) {
        if (lucky(list) && !duplicate(list)) {
            cnt[0] ++;
            //这里需要重新构建list，否则被更改时会出错
            sumList.add(new ArrayList(list));
        }
        if (list.size() == arr.length || cur >= arr.length) {
            return;
        }

        for (int i = cur;i < arr.length;i ++) {
            list.add(arr[i]);
            dfs(arr, i + 1, list, cnt);
            list.remove(list.size() - 1);
        }
    }
}
