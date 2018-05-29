package In2018.Interview.Airbnb;

/**
 * Created by 周杰伦 on 2018/5/25.
 */
/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

/*
Implement a CSVReader class that will read a comma-separated-values (CSV) file from disk, parse it, and print out the parsed elements with some other separator.


* The input delimiter is the comma, ","
* If that delimiter is contained within an element, then that element must be quoted
* If quotes are contained in an element, then that element must be quoted and use double inner quotes (escape character)

input:
John,Smith,john.smith@gmail.com,Los Angeles,1
Jane,Roberts,janer@msn.com,"San Francisco, CA",0
"Alexandra ""Alex""",Menendez,alex.menendez@gmail.com,Miami,1,""""""""
"Alexandra   ",Menendez,.menendez@gmail""""""
one,two,,four,"five"

output:
John|Smith|john.smith@gmail.com|Los Angeles|1
Jane|Roberts|janer@msn.com|San Francisco, CA|0
Alexandra "Alex"|Menendez|alex.menendez@gmail.com|Miami|1
one|two||four|five

*/
public class 字符串的替换 {
    public static void main(String[] args) {
        String input = "\"Alexandra \"\"Alex\"\"\",Menendez,alex.menendez@gmail.com,Miami,1";
        input(input);

    }
    public static void input(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < s.length();i ++) {
            if (i + 1 < s.length() && s.charAt(i) == '"' &&       s.charAt(i + 1) == '"') {
                int k = i + 2;
                while (k < s.length() && s.charAt(k) != '"') {
                    k ++;
                }
                if (k - i == 2) {
                    sb.append('"');
                }else {
                    if (k == s.length()) {
                        k = s.length() - 1;
                    }
                    sb.append(s.substring(i + 1, k + 1));
                }
            }
            else if (s.charAt(i) == '"') {
                int j = i + 1;
                while (j < s.length() && s.charAt(j) != '"') {
                    j ++;
                }
                sb.append(s.substring(i + 1,j));
                i = j;
            }
            else if (s.charAt(i) == ',') {
                sb.append("|");
            }
            else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
