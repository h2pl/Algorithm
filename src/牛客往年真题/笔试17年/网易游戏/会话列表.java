package 牛客往年真题.笔试17年.网易游戏;

import java.util.*;

/**
 * Created by 周杰伦 on 2018/8/9.
 */
public class 会话列表 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList[] arr = new ArrayList[n];
        for (int i = 0;i < n;i ++) {
            int num = scanner.nextInt();
            arr[i] = new ArrayList<Integer>();
            for (int j = 0;j < num;j ++) {
                int seq = scanner.nextInt();
                arr[i].add(seq);
            }
        }
        for (int i = 0;i < n;i ++) {
            List<Integer> list = arr[i];
            sort(list);
        }
    }

    public static void sort(List<Integer> list) {
        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>(200, (float) 0.75, true);
        for (int i : list) {
            if (map.containsKey(i)) {
                map.get(i);
            }else {
                map.put(i, 1);
            }
        }

        ListIterator<Map.Entry> iterator = new ArrayList<Map.Entry>(
                map.entrySet()).listIterator(map.size());

        while (iterator.hasPrevious()) {
            Map.Entry<Integer, Integer> entry = iterator.previous();
            System.out.print(entry.getKey() + " ");
        }
        System.out.println();
    }
}
