package In2018.Written.头条2;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/4/15.
 */
public class t3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String temp1 = input.nextLine();
        String[] ss1 = temp1.trim().split(" ");
        int q = Integer.parseInt(ss1[0]);
        for (int i = 0;i < q;i ++) {
            String temp = input.nextLine();
            String[] ss = temp.trim().split(" ");
            int m = Integer.parseInt(ss[0]);
            int n = Integer.parseInt(ss[1]);
            int x = Integer.parseInt(ss[2]);
            int y = Integer.parseInt(ss[3]);
            System.out.println(m);
            System.out.println(n);
            System.out.println(x);
            System.out.println(y);
            System.out.println(cnt(m,n,x,y,s));
        }
        input.close();
    }
    public static int cnt (int m,int n,int x,int y,String s) {
        int [][] arr = new int[m][n];
        int cnt = 0;
        for (int i = 0;i < s.length();i ++) {
            if (s.charAt(i) == 'u') {
                y = y + 1;
                cnt ++;
                if (y > n) {
                    break;
                }
            }
            else if (s.charAt(i) == 'd') {
                y = y - 1;
                cnt ++;
                if (y < 1) {
                    break;
                }
            }
            else if (s.charAt(i) == 'l') {
                x = x - 1;
                cnt ++;
                if (x < 1) {
                    break;
                }
            }
            else {
                x = x + 1;
                cnt ++;

                if (x > m) {
                    break;
                }
            }
        }
        return cnt;
    }
}
