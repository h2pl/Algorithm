package In2018.Written.招行信用卡;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/3/29.
 */
public class 括号合法字符串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] ss = str.trim().split(" ");
        int n = Integer.parseInt(ss[0]);
        List<String> list = generateParenthesis(n);
        for (String s : list) {
            if (list.indexOf(s) == list.size() - 1) {
                System.out.print(s);
            }
            else System.out.print(s + ',');
        }
    }
    public static List<String> generateParenthesis(int n) {

        List<String> rlt = new ArrayList<String>();
        if(n==0) return rlt;
        StringBuilder sb = new StringBuilder();
        core(sb,n,n,rlt);
        return rlt;
    }

    public static void core(StringBuilder sb, int l, int r, List<String> rlt) {

        if(l == 0 && r == 0) {
            rlt.add(sb.toString());
            return;
        }

        if(l<0 || r<0 || l>r) return;

        sb.append('(');
        l--;
        core(sb,l,r, rlt);
        l++;
        sb.deleteCharAt(sb.length()-1);

        sb.append(')');
        r--;
        core(sb, l, r, rlt);
        r--;
        sb.deleteCharAt(sb.length()-1);
    }
}
