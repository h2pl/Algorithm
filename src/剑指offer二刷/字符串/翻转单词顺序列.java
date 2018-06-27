package 剑指offer二刷.字符串;

/**
 * Created by 周杰伦 on 2018/6/27.
 */
public class 翻转单词顺序列 {
    public static void main(String[] args) {
        String s = "student. a am I";
        reverse(s);
    }
    public static void reverse(String s) {
        StringBuilder sb = new StringBuilder();

        int start = 0;
        for (int i = 0;i < s.length();i ++) {
            if (s.substring(i,i + 1).equals(" ")) {
                sb.append(new StringBuilder(s.substring(start, i))
                        .reverse().toString() + " ");
            }
            start = i + 1;
        }
        sb.append(new StringBuilder(s.substring(start, s.length()))
                .reverse().toString());
        sb.reverse();
        System.out.println(sb);
    }
}
