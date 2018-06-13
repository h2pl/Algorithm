package 过去笔试记录.In2018.Written.京东;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by 周杰伦 on 2018/4/9.
 */
public class 牛牛的括号匹配 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int t = Integer.parseInt(line);
        for (int i = 0;i < t;i ++) {
            String str = scanner.nextLine();
            match(str);
        }
    }
    public static void match(String s) {
        int numl=0,numr=0;
        int len = s.length();
        for(int i=0;i<len;i++)
        {
            if(s.charAt(i)=='(')
                numr++;
            else
                numl++;
        }
        if(numl!=numr)
        {
            System.out.println("No");
            return;
        }
        Stack<Character> stack = new Stack<>();
        int cnt=0;
        for(int i=0;i<len;i++)
        {
            if(s.charAt(i)=='(')
                stack.push(s.charAt(i));
            else
            {
                if(stack.isEmpty())
                    continue;
                char b=stack.peek();
                if(b=='('&&s.charAt(i) == ')')
                {
                    stack.pop();
                    cnt++;
                }
            }
        }

            if(cnt>=len/2-2) {
                System.out.println("Yes");
            }
            else
                System.out.println("No");
        return ;
    }

}
