package 校招笔试.头条.头条三轮;

import java.util.*;

/**
 * Created by 周杰伦 on 2018/9/9.
 */
public class 抖音红人 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0;i < m;i ++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (!map.containsKey(a)) {
                List<Integer> list = new ArrayList<>();
                list.add(a);
                map.put(a, list);
            }
            if (!map.containsKey(b)){
                List<Integer> list = new ArrayList<>();
                list.add(b);
                map.put(b, list);
            }
            if (!map.get(b).contains(a)) {
                map.get(b).add(a);
            }
        }
        redman(map, n);
    }
    public static void redman(HashMap<Integer, List<Integer>> map, int n) {
        fancnt.clear();
        int sum = 0;
        ArrayList<Integer> res = new ArrayList<>();
        Set<Integer> set = map.keySet();
        for (int i : set) {
            dfs(map, i, new HashSet<>());
            if (fancnt.size() >= n) {
                sum += 1;
            }
            fancnt.clear();
        }
        System.out.println(sum);
    }
    static HashSet<Integer> fancnt = new HashSet<>();
    public static void dfs(HashMap<Integer, List<Integer>> map, int key, HashSet<Integer> visit) {
        if (visit.contains(key)) {
            return;
        }

        visit.add(key);
        fancnt.add(key);

        List<Integer> list = map.get(key);
        for (int i : list) {
            fancnt.add(i);
            dfs(map, i, visit);
        }

    }
}
