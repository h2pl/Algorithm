package 校招笔试.携程;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/9/4.
 */
public class LRU {
    static class Cache extends LinkedHashMap<Integer, Integer> {

        int size;
        Cache(int size) {
            super(16, 1, true);
            this.size = size;
        }

        @Override
        public Integer put(Integer key, Integer value) {

            return super.put(key, value);
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
            return size() > size;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        Cache map = new Cache(size);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[]ss = line.split(" ");
            if (ss.length == 2) {
                int key = Integer.parseInt(ss[1]);
                if (!map.containsKey(key)) {
                    System.out.println(-1);
                }else {
                    System.out.println(map.get(key));
                }

            }else {
                int key = Integer.parseInt(ss[1]);
                int val = Integer.parseInt(ss[2]);
                map.put(key, val);
            }
        }
    }

}
