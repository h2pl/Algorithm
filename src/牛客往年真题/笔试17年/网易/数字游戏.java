package 牛客往年真题.笔试17年.网易;

import java.util.*;

/**
 * Created by 周杰伦 on 2018/5/21.
 */
public class 数字游戏 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int n = Integer.parseInt(line);
        line = scanner.nextLine();
        String []s = line.split(" ");
        int []arr = new int[n];
        for (int i = 0;i < n;i ++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(min(arr));
    }
    public static int min(int []arr) {
        Arrays.sort(arr);
        if (arr[0] != 1) {
            return 1;
        }
        int max = arr[0];
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        Set<Integer> set = map.keySet();
        for (int i = 0;i < arr.length;i ++) {
            if (arr[i] - max > 1)return max + 1;
            List<Integer> list = new ArrayList<>();
            for (int j : set) {
                list.add(j + arr[i]);
                max = Math.max(max, j + arr[i]);
            }
            for (int num : list) {
                map.put(num, 1);
            }
            map.put(arr[i], 1);
        }
        return max + 1;
    }
}
