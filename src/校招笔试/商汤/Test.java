package 校招笔试.商汤;

import java.util.*;

/**
 * Created by 周杰伦 on 2018/9/7.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(3);
    }
    static List<String> paginate(int resultsPerPage, List<String> results) {



        HashSet<Integer> set = new HashSet<>();

        List<String> res = new ArrayList<>();

        int count = 0;
        while (!results.isEmpty()) {
            count = 0;
            set = new HashSet<>();

            Iterator<String> it = results.iterator();

            while (it.hasNext() && count < resultsPerPage) {
                String word = it.next();


                String[] arr = word.split(",");

                int key = Integer.parseInt(arr[0]);

                if (set.contains(key)) {
                } else
                    {
                    set.add(key);

                    res.add(word);

                    it.remove();

                    count ++;
                }
            }
            if (count < resultsPerPage) {

                it = results.iterator();

                while (it.hasNext() && count < resultsPerPage) {

                    res.add(it.next());

                    it.remove();

                    count ++;
                }
            }
            if (count == resultsPerPage) {

                res.add("");

            }
        }
        return res;
    }
}
