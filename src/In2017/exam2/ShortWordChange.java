package In2017.exam2;

import java.util.*;

/**
 * Created by 周杰伦 on 2017/4/1.
 */
public class ShortWordChange {


    public static int ShortestLength(String start, String end, Vector<String> dict) {

        Queue<String> que=new LinkedList<String>();
        Queue<Integer> level=new LinkedList<Integer>();//用来记录当前所在的层次
        int cur = 2;

        level.offer(cur);
        que.offer(start);

        dict.add(end);

        while(!que.isEmpty())
        {
            String now = que.peek();
            que.poll();
            cur = level.peek();
            level.poll();

            for(int i=0;i<start.length();i++)
            {
                for(int j=0;j<26;j++)
                {
                    char[] next = now.toCharArray();
                    next[i] = (char) ('a' + j);
                    if(now != next.toString() && dict.indexOf(next) != dict.size()-1)
                    {
                        if(next.toString().equals(end))
                            return cur;
                        que.offer(next.toString());
                        level.offer(cur+1);
                        dict.remove(next);
                    }
                }
            }
        }
        return 0;
    }
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        String s1 = input.nextLine();
        String s2 = input.nextLine();

        String temp = input.nextLine();
        String[] ss = temp.trim().split(" ");

        Vector<String> dict=new Vector<>();
        for(int i=0;i<ss.length;i++){
           dict.add(ss[i]);
        }
        input.close();

       System.out.println(ShortestLength(s1,s2,dict));


    }

}

