package Basic.datastructure;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by 周杰伦 on 2018/3/18.
 */
public class LRU {
      class LRULinkedHashMap<K,V> extends LinkedHashMap<K,V> {
          //定义缓存的容量
           private int capacity;
           LRULinkedHashMap(int capacity) {
               this.capacity = capacity;
           }

          @Override
          protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
              return size() > capacity;
          }
      }
}
