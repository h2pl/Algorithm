package exam2;

import java.util.Scanner;

/**
 * Created by 周杰伦 on 2017/4/1.
 */
public class ToNumber26 {


    public static int AZto10(String s) {
        if (s == null) return 0;
        int n = 0;
        for (int i = s.length() - 1, j = 1; i >= 0; i--, j *= 26) {
            char c = s.charAt(i);

            if (c < 'a' || c > 'z') return 0;
            n += ((int) c - 97) * j;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()) {
            String ss = input.nextLine();
            System.out.println(AZto10(ss));
        }
        input.close();
    }
}
